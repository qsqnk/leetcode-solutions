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
    fun averageOfSubtree(root: TreeNode?): Int {
        var count = 0
        fun sumAndCount(root: TreeNode?): Pair<Int, Int> {
            root ?: return 0 to 0
            val (leftSum, leftCnt) = sumAndCount(root.left)
            val (rightSum, rightCnt) = sumAndCount(root.right)
            val totalSum = leftSum + rightSum + root.`val`
            val totalCnt = leftCnt + rightCnt + 1
            if (totalSum / totalCnt == root.`val`) count++
            return totalSum to totalCnt
        }
        sumAndCount(root)
        return count
    }
}