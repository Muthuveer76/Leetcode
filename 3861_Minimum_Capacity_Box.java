class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minCapacity = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize && capacity[i] < minCapacity) {
                minCapacity = capacity[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}