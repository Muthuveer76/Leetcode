class Solution {
    public int diagonalSum(int[][] mat) {
        int res = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            res += mat[i][i];
            res += mat[i][n - 1 - i];
        }
        if (n % 2 == 1) {
            res -= mat[n / 2][n / 2];
        }
        return res;
    }
}