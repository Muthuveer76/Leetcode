class Solution {
    private int n;
    private int k;
    private List<String> ans;
    private StringBuilder path;

    public List<String> generateValidStrings(int n, int k) {
        this.n = n;
        this.k = k;
        ans = new ArrayList<>();
        path = new StringBuilder();

        dfs(0, 0);

        return ans;
    }

    private void dfs(int index, int cost) {
        if (index == n) {
            ans.add(path.toString());
            return;
        }

        path.append('0');
        dfs(index + 1, cost);
        path.deleteCharAt(path.length() - 1);

        if ((path.length() == 0 || path.charAt(path.length() - 1) == '0')
                && cost + index <= k) {
            path.append('1');
            dfs(index + 1, cost + index);
            path.deleteCharAt(path.length() - 1);
        }
    }
}