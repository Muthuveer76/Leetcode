class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int pairs = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                pairs++;
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        return new int[]{pairs, set.size()};
    }
}