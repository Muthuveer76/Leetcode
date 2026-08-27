class Solution {
    public char kthCharacter(int k) {
        String s = "a";
        while (s.length() < k) {
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                res += (char)(s.charAt(i) + 1);
            }
            s += res;
        }
        return s.charAt(k - 1);
    }
}