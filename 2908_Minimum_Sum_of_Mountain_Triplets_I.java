class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;

        for (int j = 1; j < n - 1; j++) {
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;

            for (int i = 0; i < j; i++) {
                if (nums[i] < nums[j]) {
                    left = Math.min(left, nums[i]);
                }
            }

            for (int k = j + 1; k < n; k++) {
                if (nums[k] < nums[j]) {
                    right = Math.min(right, nums[k]);
                }
            }

            if (left != Integer.MAX_VALUE && right != Integer.MAX_VALUE) {
                ans = Math.min(ans, left + nums[j] + right);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}