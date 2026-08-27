class Solution {
    public boolean isBalanced(String num) {
        int res = 0;
        for (int i = 0; i < num.length(); i++) {
            int ch = num.charAt(i) - '0';
            if (i % 2 == 0) {
                res += ch;
            } else {
                res -= ch;
            }
        }
        return res == 0;
    }
}