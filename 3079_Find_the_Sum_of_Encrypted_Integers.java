class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans = 0;
        for (int n : nums) {
            int max = 0, digits = 0, temp = n;
            while (temp > 0) {
                max = Math.max(max, temp % 10);
                temp /= 10;
                digits++;
            }
            int encrypted = 0;
            for (int i = 0; i < digits; i++)
                encrypted = encrypted * 10 + max;
            ans += encrypted;
        }
        return ans;
    }
}