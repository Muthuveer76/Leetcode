class Solution {
    public int minimumChairs(String s) {
        int cur = 0, ans = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') {
                cur++;
                ans = Math.max(ans, cur);
            } else cur--;
        }
        return ans;
    }
}