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
class BSTIterator(root: TreeNode?) {
    
    private val stack = ArrayDeque<TreeNode>()
    
    init { push(root) }
    
    private tailrec fun push(node: TreeNode?) {
        node ?: return
        stack.push(node)
        push(node.left)
        
    }

    fun next(): Int {
        val node = stack.pop()
        push(node?.right)
        return node.`val`
    }

    fun hasNext(): Boolean = stack.isNotEmpty()

}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * var obj = BSTIterator(root)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */