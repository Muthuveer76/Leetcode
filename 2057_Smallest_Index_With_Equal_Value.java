class Solution {
    public int smallestEqual(int[] nums) {
        int result = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if (i % 10 == nums[i]){
                result = i;
                min = Math.min(min , result);
            }
        }
        return Math.min(min , result);
    }
}