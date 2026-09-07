class Solution {
    public int distinctSubseqII(String s) {
        long MOD = 1000000007;
        long dp = 0;
        long[] last = new long[26];

        for (char c : s.toCharArray()) {
            int i = c - 'a';
            long newDp = (2 * dp + 1 - last[i] + MOD) % MOD;
            last[i] = (dp + 1) % MOD;
            dp = newDp;
        }

        return (int) dp;
    }
}