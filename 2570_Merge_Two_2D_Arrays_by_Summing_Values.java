class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] arr = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            arr[nums1[i][0]] += nums1[i][1];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[nums2[i][0]] += nums2[i][1];
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }

        int[][] ans = new int[count][2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                ans[j][0] = i;
                ans[j][1] = arr[i];
                j++;
            }
        }
        return ans;
    }
}