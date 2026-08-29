class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        List<int[]> list = new ArrayList<>();
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                list.add(new int[]{r, c});
        list.sort((a, b) -> {
            int da = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int db = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);
            return da - db;
        });
        return list.toArray(new int[0][]);
    }
}