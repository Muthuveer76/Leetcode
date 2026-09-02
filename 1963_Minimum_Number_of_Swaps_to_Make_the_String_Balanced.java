class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int minBalance = 0;

        for (char c : s.toCharArray()) {
            if (c == '[') {
                balance++;
            } else {
                balance--;
            }

            minBalance = Math.min(minBalance, balance);
        }

        return (-minBalance + 1) / 2;
    }
}