class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        int ans = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0 && freq[i] < min) {
                min = freq[i];
                ans = i;
            }
        }

        return ans;
    }
}