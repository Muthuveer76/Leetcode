class Solution {
    public int arraySign(int[] nums) {
        long prod = 0;
        for(int i : nums){
            if (i == 0) {
                return 0;
            }
            if (i < 0) {
                prod++;
            }
        }
        return prod % 2 == 0 ? 1 : -1;
    }
}