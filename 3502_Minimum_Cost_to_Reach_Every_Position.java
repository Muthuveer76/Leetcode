class Solution {
    public int[] minCosts(int[] cost) {
        int[] ans = new int[cost.length];
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < cost.length; i++) {
            res = Math.min(res, cost[i]);
            ans[i] = res;
        }
        return ans;
    }
}