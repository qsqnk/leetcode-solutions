# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def addOneRow(
        self, root: Optional[TreeNode], val: int, depth: int, left=True
    ) -> Optional[TreeNode]:
        if depth == 1:  
            return TreeNode(val=val, left=root) if left else TreeNode(val=val, right=root)
        
        if not root:
            return None
          
        root.left = self.addOneRow(root.left, val, depth - 1, left=True)
        root.right = self.addOneRow(root.right, val, depth - 1, left=False)

        return root
        
        
        
            
        
        