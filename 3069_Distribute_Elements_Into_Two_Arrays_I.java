class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr = new int[nums.length];
        int[] res = new int[nums.length];
        int i = 0;
        int j = 0;
        arr[i++] = nums[0];
        res[j++] = nums[1];

        for (int k = 2; k < nums.length; k++) {
            if (arr[i - 1] > res[j - 1]) {
                arr[i++] = nums[k];
            } else {
                res[j++] = nums[k];
            }
        }

        int[] ans = new int[nums.length];
        int count = 0;

        for (int k = 0; k < i; k++) {
            ans[count++] = arr[k];
        }
        for (int k = 0; k < j; k++) {
            ans[count++] = res[k];
        }

        return ans;
    }
}