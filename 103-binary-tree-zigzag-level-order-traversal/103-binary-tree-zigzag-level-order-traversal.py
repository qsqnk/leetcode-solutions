# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root):
        levels, level = [], [root] if root else []
        n = 0
        while level:
            levels.append([n.val for n in level[::(-1, 1)[n % 2 == 0]]])
            level = [c for n in level for c in [n.left, n.right] if c]
            n += 1
        return levels