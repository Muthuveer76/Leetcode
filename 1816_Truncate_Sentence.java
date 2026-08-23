class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(arr[i]);
        }
        return result.toString();
    }
}