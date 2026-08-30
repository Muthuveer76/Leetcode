class Solution {
    public boolean areNumbersAscending(String s) {
        int previous = 0;
        int number = 0;
        boolean reading = false;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
                reading = true;
            } else if (reading) {
                if (number <= previous) {
                    return false;
                }

                previous = number;
                number = 0;
                reading = false;
            }
        }

        return !reading || number > previous;
    }
}