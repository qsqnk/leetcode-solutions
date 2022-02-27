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
    public TreeNode trimBST(TreeNode r, int L, int H) {
        if (r == null) return null;
        if (r.val < L) return trimBST(r.right, L, H);
        if (r.val > H) return trimBST(r.left, L, H);
        return new TreeNode(r.val, trimBST(r.left, L, H), trimBST(r.right, L, H));
    }
}