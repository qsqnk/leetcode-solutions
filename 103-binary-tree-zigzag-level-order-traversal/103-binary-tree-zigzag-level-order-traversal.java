class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        var q = new LinkedList<TreeNode>();
        var levels = new LinkedList<List<Integer>>();
        var lvl = 0;
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            var sz = q.size();
            var level = new LinkedList<Integer>();
            for (int i = 0; i < sz; i++) {
                var x = q.poll();
                if (lvl % 2 == 0) level.add(x.val);
                else level.addFirst(x.val);
                if (x.left != null) q.add(x.left);
                if (x.right != null) q.add(x.right);
            }
            levels.add(level);
            lvl++;
        }
        return levels;
    }
}