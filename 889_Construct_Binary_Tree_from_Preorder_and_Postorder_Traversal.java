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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build(preorder, postorder, 0, 0, preorder.length);
    }

    private TreeNode build(int[] pre, int[] post, int preStart, int postStart, int size) {
        if (size == 0) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preStart]);

        if (size == 1) {
            return root;
        }

        int leftRoot = pre[preStart + 1];
        int index = postStart;

        while (post[index] != leftRoot) {
            index++;
        }

        int leftSize = index - postStart + 1;

        root.left = build(pre, post, preStart + 1, postStart, leftSize);
        root.right = build(
            pre,
            post,
            preStart + leftSize + 1,
            index + 1,
            size - leftSize - 1
        );

        return root;
    }
}