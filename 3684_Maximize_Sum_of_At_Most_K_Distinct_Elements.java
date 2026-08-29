class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0 && list.size() < k; i--) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums[i]) {
                list.add(nums[i]);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}