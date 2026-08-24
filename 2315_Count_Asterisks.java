class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean temp = false;
        for (char ch : s.toCharArray()) {
            if (ch == '|') {
                temp = !temp;
            }
            if (ch == '*' && !temp) {
                count++;
            }
        }
        return count;
    }
}