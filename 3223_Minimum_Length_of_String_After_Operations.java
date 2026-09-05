class Solution {
    public int minimumLength(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int result = 0;

        for (int count : freq) {
            if (count == 0) {
                continue;
            }

            if (count % 2 == 0) {
                result += 2;
            } else {
                result += 1;
            }
        }

        return result;
    }
}