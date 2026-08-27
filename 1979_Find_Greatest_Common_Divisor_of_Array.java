class Solution {
    public int findGCD(int[] nums) {
        int i = nums[0];
        int j = nums[0];

        for (int k = 1; k < nums.length; k++) {
            i = Math.min(i, nums[k]);
            j = Math.max(j, nums[k]);
        }

        while (j != 0) {
            int ch = i % j;
            i = j;
            j = ch;
        }
        return i;
    }
}