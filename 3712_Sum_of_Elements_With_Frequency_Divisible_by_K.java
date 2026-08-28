class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        for (int num : map.keySet()) {
            if (map.get(num) % k == 0) {
                sum += num * map.get(num);
            }
        }

        return sum;
    }
}