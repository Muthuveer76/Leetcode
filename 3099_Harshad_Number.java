class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int res = 0;
        int count = x;
        while (count > 0) {
            res += count % 10;
            count /= 10;
        }
        if (x % res == 0) {
            return res;
        }
        return -1;
    }
}