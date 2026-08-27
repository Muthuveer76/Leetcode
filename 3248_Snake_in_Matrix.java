class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int res = 0;
        for (int i = 0; i < commands.size(); i++) {
            String ch = commands.get(i);
            if (ch.equals("RIGHT")) {
                res++;
            } else if (ch.equals("LEFT")) {
                res--;
            } else if (ch.equals("DOWN")) {
                res += n;
            } else {
                res -= n;
            }
        }
        return res;
    }
}