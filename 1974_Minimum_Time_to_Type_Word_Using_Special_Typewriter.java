class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        char prev = 'a';
        for (char c : word.toCharArray()) {
            int d = Math.abs(c - prev);
            ans += Math.min(d, 26 - d) + 1;
            prev = c;
        }
        return ans;
    }
}