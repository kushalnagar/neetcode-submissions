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
    public int maxDepth(TreeNode root) {
        return findHeight(root, 0);
    }

    int findHeight(TreeNode root, int height){
        if (root == null) {
            return height;
        }

        return Math.max(findHeight(root.left, height), findHeight(root.right, height)) + 1;
    }
}
