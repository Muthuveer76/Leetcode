class Solution {
    public int minMoves(int[] nums) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = Math.max(count, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            res += count - nums[i];
        }
        return res;
    }
}