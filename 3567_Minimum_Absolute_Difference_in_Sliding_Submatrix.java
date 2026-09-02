class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];

        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                int[] a = new int[k * k];
                int idx = 0;

                for (int x = i; x < i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        a[idx++] = grid[x][y];
                    }
                }

                Arrays.sort(a);
                int min = Integer.MAX_VALUE;

                for (int p = 1; p < a.length; p++) {
                    if (a[p] != a[p - 1]) {
                        min = Math.min(min, a[p] - a[p - 1]);
                    }
                }

                ans[i][j] = min == Integer.MAX_VALUE ? 0 : min;
            }
        }

        return ans;
    }
}