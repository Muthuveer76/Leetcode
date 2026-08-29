class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int ans = -1;
        for (int n : nums)
            if (n > 0 && set.contains(-n))
                ans = Math.max(ans, n);
        return ans;
    }
}