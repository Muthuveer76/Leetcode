class Solution {
    public int punishmentNumber(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;

            if (canPartition(square, i)) {
                result += square;
            }
        }

        return result;
    }

    private boolean canPartition(int num, int target) {
        if (num == 0) {
            return target == 0;
        }

        int divisor = 10;

        while (divisor <= num * 10) {
            int part = num % divisor;

            if (part <= target && canPartition(num / divisor, target - part)) {
                return true;
            }

            divisor *= 10;
        }

        return false;
    }
}