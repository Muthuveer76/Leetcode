class Solution {
    public int numOfWays(int n) {
        long mod = 1_000_000_007;

        long twoColors = 6;
        long threeColors = 6;

        for (int i = 2; i <= n; i++) {
            long newTwoColors = (twoColors * 3 + threeColors * 2) % mod;
            long newThreeColors = (twoColors * 2 + threeColors * 2) % mod;

            twoColors = newTwoColors;
            threeColors = newThreeColors;
        }

        return (int) ((twoColors + threeColors) % mod);
    }
}