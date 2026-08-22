class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if(oc == color){
            return image;
        }
        dfs(image , sr , sc , color , oc);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int color , int oc){
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        if (image[sr][sc] != oc) {
            return;
        }
        if (image[sr][sc] != oc) {
            return;
        }
        image[sr][sc] = color;
        dfs(image, sr + 1, sc , color , oc);
        dfs(image, sr - 1, sc , color , oc);
        dfs(image, sr , sc + 1 , color , oc);
        dfs(image, sr , sc - 1 , color , oc);
    }
}