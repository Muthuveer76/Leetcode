class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int ans = 0, left = 0, zero = 0, one = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '0') zero++;
            else one++;
            while (zero > k && one > k) {
                if (s.charAt(left++) == '0') zero--;
                else one--;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}