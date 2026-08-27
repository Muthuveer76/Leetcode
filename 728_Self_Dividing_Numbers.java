class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int j = i;
            boolean count = true;
            while (j > 0) {
                int ch = j % 10;
                if (ch == 0 || i % ch != 0) {
                    count = false;
                    break;
                }
                j /= 10;
            }
            if (count) {
                res.add(i);
            }
        }
        return res;
    }
}