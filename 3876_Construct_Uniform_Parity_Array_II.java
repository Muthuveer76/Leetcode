class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        boolean hasEven = false;

        for (int x : nums1) {
            if ((x & 1) == 1) {
                minOdd = Math.min(minOdd, x);
            } else {
                hasEven = true;
            }
        }

        if (minOdd == Integer.MAX_VALUE || !hasEven) {
            return true;
        }

        for (int x : nums1) {
            if ((x & 1) == 0 && minOdd >= x) {
                return false;
            }
        }

        return true;
    }
}