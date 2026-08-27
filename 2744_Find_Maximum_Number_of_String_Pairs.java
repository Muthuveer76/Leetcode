class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                String ch = new StringBuilder(words[j]).reverse().toString();
                if (words[i].equals(ch)) {
                    res++;
                }
            }
        }
        return res;
    }
}