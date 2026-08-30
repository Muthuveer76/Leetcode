class Solution {
    public int minimumOperations(int[][] grid) {
        int operations = 0;

        for (int col = 0; col < grid[0].length; col++) {
            for (int row = 1; row < grid.length; row++) {
                if (grid[row][col] <= grid[row - 1][col]) {
                    int add = grid[row - 1][col] + 1 - grid[row][col];
                    operations += add;
                    grid[row][col] += add;
                }
            }
        }

        return operations;
    }
}