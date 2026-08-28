class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pos = 0;
        int blank = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                pos--;
            } else if (c == 'R') {
                pos++;
            } else {
                blank++;
            }
        }

        return Math.abs(pos) + blank;
    }
}