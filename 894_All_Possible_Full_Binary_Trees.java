/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) return new ArrayList<>();

        List<TreeNode>[][] dp = new List[n + 1][];

        for (int i = 1; i <= n; i += 2) {
            dp[i] = new List[1];
            dp[i][0] = new ArrayList<>();
        }

        dp[1][0].add(new TreeNode(0));

        for (int nodes = 3; nodes <= n; nodes += 2) {
            List<TreeNode> current = dp[nodes][0];

            for (int left = 1; left < nodes; left += 2) {
                int right = nodes - 1 - left;

                for (TreeNode l : dp[left][0]) {
                    for (TreeNode r : dp[right][0]) {
                        TreeNode root = new TreeNode(0);
                        root.left = l;
                        root.right = r;
                        current.add(root);
                    }
                }
            }
        }

        return dp[n][0];
    }
}