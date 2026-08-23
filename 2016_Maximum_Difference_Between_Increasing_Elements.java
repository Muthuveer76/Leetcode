class Solution {
    public int maximumDifference(int[] nums) {
        int minNum = nums[0];
        int max = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minNum) {
                max = Math.max(max, nums[i] - minNum);
            } else {
                minNum = nums[i];
            }
        }
        return max;
    }
}