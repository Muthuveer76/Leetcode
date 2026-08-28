class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0, ans = 0;
        for (int[] r : rectangles) {
            int x = Math.min(r[0], r[1]);
            if (x > max) {
                max = x;
                ans = 1;
            } else if (x == max) ans++;
        }
        return ans;
    }
}