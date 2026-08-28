class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int x : nums) m.put(x, m.getOrDefault(x, 0) + 1);
        Integer[] a = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) a[i] = nums[i];
        Arrays.sort(a, (x, y) -> m.get(x).equals(m.get(y)) ? Integer.compare(y, x) : Integer.compare(m.get(x), m.get(y)));
        for (int i = 0; i < nums.length; i++) nums[i] = a[i];
        return nums;
    }
}