# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def mergeTrees(self, r1: TreeNode, r2: TreeNode) -> TreeNode:
        if not r1 or not r2: return r1 or r2
        return TreeNode(r1.val + r2.val, self.mergeTrees(r1.left, r2.left), self.mergeTrees(r1.right, r2.right))