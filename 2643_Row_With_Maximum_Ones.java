class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = 0, max = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int x : mat[i])
                count += x;
            if (count > max) {
                max = count;
                row = i;
            }
        }
        return new int[]{row, max};
    }
}