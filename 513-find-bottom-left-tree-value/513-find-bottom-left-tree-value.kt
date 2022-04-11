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
    fun findBottomLeftValue(root: TreeNode?): Int {
        root ?: return -1
        var level = listOf(root)
        var leftMost = root.`val`
        while (level.isNotEmpty()) {
            leftMost = level.first().`val`
            level = level.flatMap { r -> listOf(r.left, r.right).filterNotNull() }
        }
        return leftMost
    }
}