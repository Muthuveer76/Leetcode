class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for (String s : strs) {
            boolean numeric = true;
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    numeric = false;
                    break;
                }
            }
            ans = Math.max(ans, numeric ? Integer.parseInt(s) : s.length());
        }
        return ans;
    }
}