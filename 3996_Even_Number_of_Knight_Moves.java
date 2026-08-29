class Solution {
    public boolean canReach(int[] start, int[] target) {
        int[][] moves = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
        boolean[][][] visited = new boolean[8][8][2];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]][0] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1], parity = cur[2];
            if (x == target[0] && y == target[1] && parity == 0)
                return true;
            for (int[] move : moves) {
                int nx = x + move[0], ny = y + move[1];
                int np = parity ^ 1;
                if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8 && !visited[nx][ny][np]) {
                    visited[nx][ny][np] = true;
                    q.offer(new int[]{nx, ny, np});
                }
            }
        }
        return false;
    }
}