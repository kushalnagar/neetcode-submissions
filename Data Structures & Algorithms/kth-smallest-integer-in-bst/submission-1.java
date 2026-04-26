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
    public int kthSmallestDFS(TreeNode root, int k) {
        List<Integer> list= new ArrayList<>();

        dfs(root, list);
        Collections.sort(list);
        return list.get(k-1);

    }

    private void dfs(TreeNode root, List list){
        if(root == null) {
            return;
        }

        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);

    }

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            k--;
            if (k == 0) {
                return curr.val;
            }
            curr = curr.right;
        }

        return -1;
    }

}
