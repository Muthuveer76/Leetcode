class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] ans = new long[nums.length];
        long max = 0;
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            sum += nums[i] + max;
            ans[i] = sum;
        }

        return ans;
    }
}