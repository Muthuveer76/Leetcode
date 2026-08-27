class Solution {
    public int earliestTime(int[][] tasks) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < tasks.length; i++) {
            int count = tasks[i][0] + tasks[i][1];
            res = Math.min(res, count);
        }
        return res;
    }
}