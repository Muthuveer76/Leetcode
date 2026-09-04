class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], words[i - 1])) {
                ans.add(words[i]);
            }
        }

        return ans;
    }

    boolean isAnagram(String a, String b) {
        int[] count = new int[26];

        for (char c : a.toCharArray()) count[c - 'a']++;
        for (char c : b.toCharArray()) count[c - 'a']--;

        for (int x : count) {
            if (x != 0) return false;
        }

        return true;
    }
}