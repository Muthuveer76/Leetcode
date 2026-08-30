class Solution {
    public int splitNum(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);

        int a = 0;
        int b = 0;

        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                a = a * 10 + (digits[i] - '0');
            } else {
                b = b * 10 + (digits[i] - '0');
            }
        }
        return a + b;
    }
}