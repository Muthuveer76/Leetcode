class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        k %= n;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int shifted = i % 2 == 0 ? (j + k) % n : (j - k + n) % n;
                if (mat[i][j] != mat[i][shifted])
                    return false;
            }
        }
        return true;
    }
}