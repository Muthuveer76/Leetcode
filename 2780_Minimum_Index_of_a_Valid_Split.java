class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int candidate = nums.get(0);
        int count = 0;

        for (int num : nums) {
            if (num == candidate) {
                count++;
            } else if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                count--;
            }
        }

        int total = 0;
        for (int num : nums) {
            if (num == candidate) {
                total++;
            }
        }

        int leftCount = 0;

        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == candidate) {
                leftCount++;
            }

            int leftSize = i + 1;
            int rightSize = n - leftSize;
            int rightCount = total - leftCount;

            if (leftCount * 2 > leftSize && rightCount * 2 > rightSize) {
                return i;
            }
        }

        return -1;
    }
}