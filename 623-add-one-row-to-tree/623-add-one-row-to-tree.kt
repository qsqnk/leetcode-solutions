/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun addOneRow(
        node: TreeNode?, value: Int, depth: Int, isleft: Boolean = true
    ): TreeNode? {
        if (depth == 1) return TreeNode(value).apply {
            if (isleft) left = node else right = node
        }
        node ?: return null
        return node.apply {
            left = addOneRow(node.left, value, depth - 1, true)
            right = addOneRow(node.right, value, depth - 1, false)
        }
    }
}