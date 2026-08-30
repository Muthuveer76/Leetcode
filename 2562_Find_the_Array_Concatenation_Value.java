class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            ans += Long.parseLong(
                String.valueOf(nums[left]) + nums[right]
            );

            left++;
            right--;
        }
        if (left == right) {
            ans += nums[left];
        }
        return ans;
    }
}