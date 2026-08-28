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
    TreeNode head, tail;
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return head;
    }
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (head == null) head = root;
        else tail.right = root;
        root.left = null;
        tail = root;
        inorder(root.right);
    }
}