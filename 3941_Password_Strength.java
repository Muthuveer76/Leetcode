class Solution {
    public int passwordStrength(String password) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        boolean[] digit = new boolean[10];
        boolean[] special = new boolean[4];

        int strength = 0;

        for (char c : password.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (!lower[c - 'a']) {
                    lower[c - 'a'] = true;
                    strength += 1;
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (!upper[c - 'A']) {
                    upper[c - 'A'] = true;
                    strength += 2;
                }
            } else if (c >= '0' && c <= '9') {
                if (!digit[c - '0']) {
                    digit[c - '0'] = true;
                    strength += 3;
                }
            } else {
                int index = "!@#$".indexOf(c);
                if (!special[index]) {
                    special[index] = true;
                    strength += 5;
                }
            }
        }

        return strength;
    }
}