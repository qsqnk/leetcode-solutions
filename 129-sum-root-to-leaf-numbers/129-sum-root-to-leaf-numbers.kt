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
    fun sumNumbers(root: TreeNode?): Int {
        root ?: return 0
        return sum(root, root.`val`)
    }
    
    fun sum(root: TreeNode, n: Int): Int {
        root.left ?: root.right ?: return n
        var sum = 0
        root.left?.let { sum += sum(it, n * 10 + it.`val`) }
        root.right?.let { sum += sum(it, n * 10 + it.`val`) }
        return sum
    }
}