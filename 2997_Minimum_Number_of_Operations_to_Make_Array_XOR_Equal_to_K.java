class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        int diff = xor ^ k;
        int ans = 0;

        while (diff != 0) {
            ans += diff & 1;
            diff >>= 1;
        }

        return ans;
    }
}