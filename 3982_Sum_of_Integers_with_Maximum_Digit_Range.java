class Solution {
    public int maxDigitRange(int[] nums) {
        int ans = 0;
        int maxRange = -1;

        for (int num : nums) {
            int x = num;
            int minDigit = 10;
            int maxDigit = 0;

            while (x > 0) {
                int digit = x % 10;
                minDigit = Math.min(minDigit, digit);
                maxDigit = Math.max(maxDigit, digit);
                x /= 10;
            }

            int range = maxDigit - minDigit;

            if (range > maxRange) {
                maxRange = range;
                ans = num;
            } else if (range == maxRange) {
                ans += num;
            }
        }

        return ans;
    }
}