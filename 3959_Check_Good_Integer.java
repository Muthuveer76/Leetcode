class Solution {
    public boolean checkGoodInteger(int n) {
        int res = 0;
        while (n > 0) {
            int ch = n % 10;
            res += ch * (ch - 1);
            n /= 10;
        }
        return res >= 50;
    }
}