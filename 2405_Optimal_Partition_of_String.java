class Solution {
    public int partitionString(String s) {
        int ans = 1;
        int mask = 0;

        for (char c : s.toCharArray()) {
            int bit = c - 'a';

            if ((mask & (1 << bit)) != 0) {
                ans++;
                mask = 0;
            }

            mask |= 1 << bit;
        }

        return ans;
    }
}