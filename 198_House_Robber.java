class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if(nums.length > 1){
            dp[1] = Math.max(dp[0] , nums[1]);
        }
        for(int i = 2 ; i < nums.length ; i++){
            int temp = dp[i-1];
            int temp2 = nums[i] + dp[i-2];
            dp[i] = Math.max(temp , temp2);
        }
        return dp[nums.length - 1];
    }
}