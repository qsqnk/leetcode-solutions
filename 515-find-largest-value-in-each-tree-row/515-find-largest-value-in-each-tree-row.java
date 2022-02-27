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
    public List<Integer> largestValues(TreeNode root) {
        var q = new LinkedList<TreeNode>();
        if (root != null) {
            q.add(root);
        }
        var ans = new ArrayList<Integer>();
        while (!q.isEmpty()) {
            var sz = q.size();
            var mx = Integer.MIN_VALUE;
            for (int i = 0; i < sz; i++) {
                var node = q.poll();
                mx = Math.max(mx, node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            ans.add(mx);
        }
        return ans;
    }
}