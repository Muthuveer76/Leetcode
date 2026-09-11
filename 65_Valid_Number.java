class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean exponent = false;
        boolean exponentDigit = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                digit = true;
                if (exponent) {
                    exponentDigit = true;
                }
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
                if (i == s.length() - 1) {
                    return false;
                }
            } else if (c == '.') {
                if (dot || exponent) {
                    return false;
                }
                dot = true;
            } else if (c == 'e' || c == 'E') {
                if (exponent || !digit || i == s.length() - 1) {
                    return false;
                }
                exponent = true;
                exponentDigit = false;
            } else {
                return false;
            }
        }

        return digit && exponentDigit;
    }
}