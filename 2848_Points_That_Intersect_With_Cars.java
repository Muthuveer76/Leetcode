class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] covered = new boolean[101];

        for (List<Integer> car : nums) {
            for (int i = car.get(0); i <= car.get(1); i++) {
                covered[i] = true;
            }
        }
        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            if (covered[i]) {
                ans++;
            }
        }

        return ans;
    }
}