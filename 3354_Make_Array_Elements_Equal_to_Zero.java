class Solution {
    public int countValidSelections(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;

            int left = 0, right = 0;

            for (int j = 0; j < i; j++) {
                left += nums[j];
            }

            for (int j = i + 1; j < n; j++) {
                right += nums[j];
            }

            if (left == right) {
                ans += 2;
            } else if (Math.abs(left - right) == 1) {
                ans++;
            }
        }

        return ans;
    }
}