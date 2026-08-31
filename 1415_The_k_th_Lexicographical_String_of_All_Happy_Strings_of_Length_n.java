class Solution {
    int k;
    String ans = "";

    public String getHappyString(int n, int k) {
        this.k = k;
        dfs(n, new StringBuilder());
        return ans;
    }

    private void dfs(int n, StringBuilder sb) {
        if (!ans.isEmpty()) return;

        if (sb.length() == n) {
            if (--k == 0) ans = sb.toString();
            return;
        }

        for (char c = 'a'; c <= 'c'; c++) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) continue;

            sb.append(c);
            dfs(n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}