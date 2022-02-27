class Solution {
    public int orangesRotting(int[][] grid) {
        var q = new LinkedList<int[]>();
        var fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        var time = 0;
        while (!q.isEmpty() && fresh > 0) {
            var sz = q.size();
            for (int i = 0; i < sz; i++) {
                var node = q.poll();
                for (int dx = -1; dx <= 1; dx++) {
                    for (int dy = -1; dy <= 1; dy++) {
                        if (Math.abs(dx) == Math.abs(dy)) {
                            continue;
                        }
                        int x = node[0] + dx;
                        int y = node[1] + dy;
                        if (0 <= x && x < grid.length && 0 <= y && y < grid[x].length && grid[x][y] == 1) {
                            q.add(new int[]{x, y});
                            grid[x][y] = 2;
                            fresh--;
                        }
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}