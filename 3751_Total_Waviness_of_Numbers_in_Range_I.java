class Solution {
    public int totalWaviness(int num1, int num2) {
        return (int)solve(num2) - (int)solve(num1 - 1);
    }

    private long solve(long n) {
        if (n < 100) return 0;

        long ans = 0;

        for (long x = 100; x <= n; x++) {
            String s = String.valueOf(x);

            for (int i = 1; i < s.length() - 1; i++) {
                int a = s.charAt(i - 1) - '0';
                int b = s.charAt(i) - '0';
                int c = s.charAt(i + 1) - '0';

                if ((b > a && b > c) || (b < a && b < c)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}