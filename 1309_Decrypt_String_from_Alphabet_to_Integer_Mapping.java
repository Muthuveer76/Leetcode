class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length();) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int x = Integer.parseInt(s.substring(i, i + 2));
                ans.append((char)('a' + x - 1));
                i += 3;
            } else {
                ans.append((char)('a' + s.charAt(i) - '1'));
                i++;
            }
        }
        return ans.toString();
    }
}