class Solution {
    public int calPoints(String[] operations) {
        int[] a = new int[operations.length];
        int n = 0;
        for (String s : operations) {
            if (s.equals("+")) a[n] = a[n - 1] + a[n - 2];
            else if (s.equals("D")) a[n] = 2 * a[n - 1];
            else if (s.equals("C")) { n--; continue; }
            else a[n] = Integer.parseInt(s);
            n++;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) sum += a[i];
        return sum;
    }
}