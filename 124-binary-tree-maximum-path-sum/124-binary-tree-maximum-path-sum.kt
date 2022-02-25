class Solution {
    fun maxPathSum(root: TreeNode?): Int {
        var mx = Int.MIN_VALUE
        fun helper(root: TreeNode?): Int {
            root ?: return 0
            val l = helper(root.left)
            val r = helper(root.right)
            val result = root.`val` + maxOf(l, 0) + maxOf(r, 0)
            mx = maxOf(mx, result)
            return root.`val` + maxOf(l, r, 0)
        }
        helper(root)
        return mx
    }
}