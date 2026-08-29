class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            left[i] = set.size();
        }

        set.clear();

        for (int i = n - 1; i >= 0; i--) {
            right[i] = set.size();
            set.add(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            ans[i] = left[i] - right[i];
        }

        return ans;
    }
}