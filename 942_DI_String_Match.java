class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int i = 0;
        int j = s.length();
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) == 'I') {
                ans[k] = i++;
            } else {
                ans[k] = j--;
            }
        }
        ans[s.length()] = i;
        return ans;
    }
}