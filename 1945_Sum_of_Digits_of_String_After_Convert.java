class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            sb.append(c - 'a' + 1);
        int num = 0;
        for (char c : sb.toString().toCharArray())
            num += c - '0';
        for (int i = 1; i < k; i++) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}