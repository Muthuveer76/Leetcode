class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;

        for (int x : position) {
            if (x % 2 == 0) {
                even++;
            }
        }

        return Math.min(even, position.length - even);
    }
}