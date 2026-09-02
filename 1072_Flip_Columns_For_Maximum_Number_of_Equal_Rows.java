class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();
        int ans = 0;

        for (int[] row : matrix) {
            char[] pattern = new char[row.length];

            for (int j = 0; j < row.length; j++) {
                pattern[j] = (char) ('0' + (row[j] ^ row[0]));
            }

            String key = new String(pattern);
            int count = map.getOrDefault(key, 0) + 1;
            map.put(key, count);

            ans = Math.max(ans, count);
        }

        return ans;
    }
}