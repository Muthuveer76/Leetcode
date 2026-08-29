class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int x = i, sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            max = Math.max(max, ++count[sum]);
        }
        int ans = 0;
        for (int x : count)
            if (x == max) ans++;
        return ans;
    }
}