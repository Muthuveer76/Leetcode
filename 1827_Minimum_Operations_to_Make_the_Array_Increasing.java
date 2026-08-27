class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int count = nums[i - 1] + 1 - nums[i];
                res += count;
                nums[i] += count;
            }
        }
        return res;
    }
}