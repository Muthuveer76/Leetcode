class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int position = 0, ans = 0;
        for (int n : nums) {
            position += n;
            if (position == 0)
                ans++;
        }
        return ans;
    }
}