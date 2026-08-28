class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] col = new int[n];
        Arrays.fill(col, Integer.MIN_VALUE);
        for (int j = 0; j < n; j++) for (int i = 0; i < m; i++) col[j] = Math.max(col[j], matrix[i][j]);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int mn = Integer.MAX_VALUE, idx = -1;
            for (int j = 0; j < n; j++) if (matrix[i][j] < mn) {
                mn = matrix[i][j];
                idx = j;
            }
            if (mn == col[idx]) ans.add(mn);
        }
        return ans;
    }
}