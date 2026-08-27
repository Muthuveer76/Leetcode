class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        char ch = s.charAt(0);
        char count = s.charAt(3);
        int i = s.charAt(1) - '0';
        int j = s.charAt(4) - '0';

        for (char a = ch; a <= count; a++) {
            for (int b = i; b <= j; b++) {
                res.add("" + a + b);
            }
        }
        return res;
    }
}