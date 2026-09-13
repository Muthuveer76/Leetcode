class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for (int len = 2; len <= 9; len++) {
            for (int start = 1; start <= 10 - len; start++) {
                int num = 0;

                for (int d = start; d < start + len; d++) {
                    num = num * 10 + d;
                }

                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        Collections.sort(result);
        return result;
    }
}