class Solution {
    int target;
    int count = 0;
    private void dfs(int[] nums, int index, int currentOr) {
        if (index == nums.length) {
            if (currentOr == target) {
                count++;
            }
            return;
        }
        dfs(nums, index + 1, currentOr | nums[index]);
        dfs(nums, index + 1, currentOr);
    }
    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) {
            target |= num;
        }
        dfs(nums, 0, 0);
        return count;
    }
}