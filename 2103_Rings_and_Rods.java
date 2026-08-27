class Solution {
    public int countPoints(String rings) {
        boolean[][] arr = new boolean[10][3];
        for (int i = 0; i < rings.length(); i += 2) {
            char ch = rings.charAt(i);
            int j = rings.charAt(i + 1) - '0';
            if (ch == 'R') {
                arr[j][0] = true;
            } else if (ch == 'G') {
                arr[j][1] = true;
            } else {
                arr[j][2] = true;
            }
        }

        int res = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i][0] && arr[i][1] && arr[i][2]) {
                res++;
            }
        }
        return res;
    }
}