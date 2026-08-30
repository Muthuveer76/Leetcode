class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] available = new int[26];

        for (char c : chars.toCharArray()) {
            available[c - 'a']++;
        }
        int ans = 0;
        for (String word : words) {
            int[] count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            boolean possible = true;
            for (int i = 0; i < 26; i++) {
                if (count[i] > available[i]) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                ans += word.length();
            }
        }
        return ans;
    }
}