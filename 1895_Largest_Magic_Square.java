class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] row = new int[m][n + 1];
        int[][] col = new int[m + 1][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                row[i][j + 1] = row[i][j] + grid[i][j];
                col[i + 1][j] = col[i][j] + grid[i][j];
            }
        }

        for (int size = Math.min(m, n); size >= 2; size--) {
            for (int r = 0; r + size <= m; r++) {
                for (int c = 0; c + size <= n; c++) {
                    int target = row[r][c + size] - row[r][c];
                    boolean valid = true;

                    for (int i = r; i < r + size; i++) {
                        if (row[i][c + size] - row[i][c] != target) {
                            valid = false;
                            break;
                        }
                    }

                    if (!valid) continue;

                    for (int j = c; j < c + size; j++) {
                        if (col[r + size][j] - col[r][j] != target) {
                            valid = false;
                            break;
                        }
                    }

                    if (!valid) continue;

                    int diag1 = 0;
                    int diag2 = 0;

                    for (int i = 0; i < size; i++) {
                        diag1 += grid[r + i][c + i];
                        diag2 += grid[r + i][c + size - 1 - i];
                    }

                    if (diag1 == target && diag2 == target) {
                        return size;
                    }
                }
            }
        }

        return 1;
    }
}