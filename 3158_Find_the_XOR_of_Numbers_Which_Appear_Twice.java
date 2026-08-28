class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            if (set.contains(x)) ans ^= x;
            else set.add(x);
        }
        return ans;
    }
}