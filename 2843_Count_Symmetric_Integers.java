class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; i++) {
            String ch = String.valueOf(i);
            if (ch.length() % 2 == 1) {
                continue;
            }

            int count = 0;
            int j = 0;
            int k = ch.length() - 1;

            while (j < k) {
                count += (ch.charAt(j) - '0');
                count -= (ch.charAt(k) - '0');
                j++;
                k--;
            }

            if (count == 0) {
                res++;
            }
        }
        return res;
    }
}