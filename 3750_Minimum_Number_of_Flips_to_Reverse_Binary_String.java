class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int ans = 0;

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                ans += 2;
            }
        }

        return ans;
    }
}