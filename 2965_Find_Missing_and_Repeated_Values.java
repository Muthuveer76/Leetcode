class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        boolean[] arr = new boolean[n * n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ch = grid[i][j];
                if (arr[ch]) {
                    ans[0] = ch;
                }
                arr[ch] = true;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (!arr[i]) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}