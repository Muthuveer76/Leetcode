class Solution {
    int[] parent;

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int total = n * n * 4;

        parent = new int[total];

        for (int i = 0; i < total; i++) {
            parent[i] = i;
        }

        int regions = total;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int base = (i * n + j) * 4;

                if (i + 1 < n) {
                    if (union(base + 2, base + n * 4)) {
                        regions--;
                    }
                }

                if (j + 1 < n) {
                    if (union(base + 1, base + 7)) {
                        regions--;
                    }
                }

                char c = grid[i].charAt(j);

                if (c == '/') {
                    if (union(base, base + 3)) {
                        regions--;
                    }
                    if (union(base + 1, base + 2)) {
                        regions--;
                    }
                } else if (c == '\\') {
                    if (union(base, base + 1)) {
                        regions--;
                    }
                    if (union(base + 2, base + 3)) {
                        regions--;
                    }
                } else {
                    if (union(base, base + 1)) {
                        regions--;
                    }
                    if (union(base + 1, base + 2)) {
                        regions--;
                    }
                    if (union(base + 2, base + 3)) {
                        regions--;
                    }
                }
            }
        }

        return regions;
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private boolean union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa == pb) {
            return false;
        }

        parent[pa] = pb;
        return true;
    }
}