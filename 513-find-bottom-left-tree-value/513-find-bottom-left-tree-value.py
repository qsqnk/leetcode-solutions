# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findBottomLeftValue(self, root: Optional[TreeNode]) -> int:
        level, leftmost = [root], root.val
        while level:
            leftmost = level[0].val
            level = [c for n in level for c in [n.left, n.right] if c]
        return leftmost
        