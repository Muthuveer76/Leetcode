class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        int prev2 = 1;
        int prev1 = s.charAt(0) == '0' ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            int curr = 0;

            if (s.charAt(i - 1) != '0') {
                curr += prev1;
            }

            int num = Integer.parseInt(s.substring(i - 2, i));

            if (num >= 10 && num <= 26) {
                curr += prev2;
            }

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}