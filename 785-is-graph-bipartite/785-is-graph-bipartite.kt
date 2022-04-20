class Solution {
    fun isBipartite(g: Array<IntArray>): Boolean {
        var (colors, good) = IntArray(g.size) { -1 } to true
        fun dfs(u: Int, color: Int) {
            colors[u] = color
            for (v in g[u]) {
                if (colors[v] == -1) dfs(v, color xor 1)
                good = good && colors[u] != colors[v]
            }
        }
        g.indices.forEach { u -> if (colors[u] == -1) dfs(u, 0) }
        return good
    }
}