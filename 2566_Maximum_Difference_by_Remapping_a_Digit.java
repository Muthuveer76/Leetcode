class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);

        char maxDigit = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                maxDigit = c;
                break;
            }
        }

        char minDigit = s.charAt(0);

        String max = maxDigit == ' ' ? s : s.replace(maxDigit, '9');
        String min = s.replace(minDigit, '0');

        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}