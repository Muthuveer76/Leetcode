class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < count - 1; i++) {
            res.append('1');
        }
        for (int i = 0; i < s.length() - count; i++) {
            res.append('0');
        }
        res.append('1');
        return res.toString();
    }
}