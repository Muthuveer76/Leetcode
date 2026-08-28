class Solution {
    public int sumOfUnique(int[] nums) {
        int[] f = new int[101];
        for (int x : nums) f[x]++;
        int ans = 0;
        for (int i = 0; i <= 100; i++) if (f[i] == 1) ans += i;
        return ans;
    }
}