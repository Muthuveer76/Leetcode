class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rows = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int x : mat[i]){
                if (x == 1) count++;
            }
            rows[i] = new int[]{count, i};
        }
        Arrays.sort(rows, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++){
            ans[i] = rows[i][1];
        }
        return ans;

    }
}