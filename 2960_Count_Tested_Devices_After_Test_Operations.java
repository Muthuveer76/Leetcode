class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        for (int x : batteryPercentages) {
            if (x > ans) ans++;
        }
        return ans;
    }
}