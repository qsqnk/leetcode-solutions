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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        root ?: return emptyList()
        val levels = arrayListOf<List<Int>>()
        var level = listOf(root)
        while (level.isNotEmpty()) {
            levels.add(level.map(TreeNode::`val`)) 
            level = level.flatMap { x -> arrayListOf<TreeNode>().apply {
                    x.left?.let(::add)
                    x.right?.let(::add)
                }
            }
        }
        return levels
    }
}