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
    public int widthOfBinaryTree(TreeNode root) {
        var dq = new LinkedList<TreeNode>();
        var index = new LinkedList<Integer>();
        if (root != null) {
            dq.add(root);
            index.add(1);
        }
        var width = 0;
        while (!dq.isEmpty()) {
            var sz = dq.size();
            var leftMost = index.peek();
            for (int i = 0; i < sz; i++) {
                var node = dq.poll();
                var ind = index.poll();
                width = Math.max(width, ind - leftMost + 1);
                if (node.left != null) {
                    dq.add(node.left);
                    index.add(ind * 2);
                }
                if (node.right != null) {
                    dq.add(node.right);
                    index.add(ind * 2 + 1);
                }
            }
        }
        return width;
    }
}