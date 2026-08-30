class Solution {
    public int numRookCaptures(char[][] board) {
        int r = 0;
        int c = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    r = i;
                    c = j;
                }
            }
        }
        int ans = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int[] dir : directions) {
            int x = r + dir[0];
            int y = c + dir[1];
            while (x >= 0 && x < 8 && y >= 0 && y < 8) {
                if (board[x][y] == 'B') {
                    break;
                }

                if (board[x][y] == 'p') {
                    ans++;
                    break;
                }

                x += dir[0];
                y += dir[1];
            }
        }
        return ans;
    }
}