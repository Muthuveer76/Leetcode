class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            String s = words[i];
            if ("aeiou".indexOf(s.charAt(0)) >= 0 &&
                "aeiou".indexOf(s.charAt(s.length() - 1)) >= 0)
                ans++;
        }
        return ans;
    }
}