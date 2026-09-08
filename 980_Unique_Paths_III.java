class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int sx = 0, sy = 0, empty = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != -1) empty++;
                if (grid[i][j] == 1) {
                    sx = i;
                    sy = j;
                }
            }
        }

        return dfs(grid, sx, sy, empty);
    }

    private int dfs(int[][] grid, int x, int y, int remaining) {
        if (grid[x][y] == 2) {
            return remaining == 1 ? 1 : 0;
        }

        int original = grid[x][y];
        grid[x][y] = -1;

        int count = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int[] d : dirs) {
            int nx = x + d[0];
            int ny = y + d[1];

            if (nx >= 0 && nx < grid.length &&
                ny >= 0 && ny < grid[0].length &&
                grid[nx][ny] != -1) {
                count += dfs(grid, nx, ny, remaining - 1);
            }
        }

        grid[x][y] = original;
        return count;
    }
}