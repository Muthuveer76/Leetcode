class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int i = nums1[0];
        int j = nums2[0];
        for (int k = 1; k < nums1.length; k++) {
            i = Math.min(i, nums1[k]);
            j = Math.min(j, nums2[k]);
        }
        return j - i;
    }
}