/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return dfs(grid, 0, 0, grid.length);
    }

    private Node dfs(int[][] grid, int r, int c, int size) {
        int value = grid[r][c];
        boolean same = true;

        for (int i = r; i < r + size && same; i++) {
            for (int j = c; j < c + size; j++) {
                if (grid[i][j] != value) {
                    same = false;
                    break;
                }
            }
        }

        if (same) {
            return new Node(value == 1, true);
        }

        int half = size / 2;

        Node topLeft = dfs(grid, r, c, half);
        Node topRight = dfs(grid, r, c + half, half);
        Node bottomLeft = dfs(grid, r + half, c, half);
        Node bottomRight = dfs(grid, r + half, c + half, half);

        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }
}