class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row : grid) Arrays.sort(row);
        int ans = 0;
        for (int j = 0; j < grid[0].length; j++) {
            int mx = 0;
            for (int i = 0; i < grid.length; i++) mx = Math.max(mx, grid[i][j]);
            ans += mx;
        }
        return ans;
    }
}