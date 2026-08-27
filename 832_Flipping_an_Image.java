class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            int j = 0;
            int count = n - 1;
            while (j <= count) {
                int ch = image[i][j];
                image[i][j] = 1 - image[i][count];
                image[i][count] = 1 - ch;
                j++;
                count--;
            }
        }
        return image;
    }
}