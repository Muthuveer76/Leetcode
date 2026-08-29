class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[100];
        int ans = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int n = i, sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            ans = Math.max(ans, ++count[sum]);
        }
        return ans;
    }
}