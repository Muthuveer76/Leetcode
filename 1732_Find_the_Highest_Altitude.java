class Solution {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < gain.length; i++) {
            count += gain[i];
            res = Math.max(res, count);
        }
        return res;
    }
}