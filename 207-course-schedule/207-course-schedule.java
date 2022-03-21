class Solution {
    private static int[] colors;
    boolean hasCycle = false;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        colors = new int[numCourses];
        while (numCourses-- > 0) graph.add(new ArrayList<>());
        for (int[] e : prerequisites) graph.get(e[0]).add(e[1]);
        checkForCycle(graph);
        return !hasCycle;
    }
    
    void checkForCycle(List<List<Integer>> graph) {
        for (int x = 0; x < graph.size(); x++) {
            if (colors[x] == 0) {
                dfs(x, graph);
            }
        }
    }
    
    void dfs(int x, List<List<Integer>> graph) {
        colors[x] = 1;
        for (int y : graph.get(x)) {
            if (colors[y] == 1) {
                hasCycle = true;
            } else if (colors[y] == 0) {
                dfs(y, graph);
            }
        }
        colors[x] = 2;
    }    
}