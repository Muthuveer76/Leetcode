class Solution {
    public int reverse(int x) {
        int rev = 0;
        boolean isNegative = x < 0;
        while (x != 0) {
            int temp = x % 10;
            if (rev > 214748364 || (rev == 214748364 && temp > 7)){ 
                return 0;
            }
            if (rev < -214748364 || (rev == -214748364 && temp < -8)){
                return 0;
            }
            rev = rev * 10 + temp;
            x /= 10;
        }
        return rev;
    }
}