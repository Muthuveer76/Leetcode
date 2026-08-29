class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = (s.length() + k - 1) / k;
        String[] ans = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++) {
                int index = i * k + j;

                if (index < s.length()) {
                    sb.append(s.charAt(index));
                } else {
                    sb.append(fill);
                }
            }
            ans[i] = sb.toString();
        }
        return ans;
    }
}