class Solution {
    fun isBipartite(g: Array<IntArray>): Boolean {
        val p = IntArray(g.size) { -1 }
        var bad = false
        fun dfs(u: Int, even: Boolean) {
            p[u] = if (even) 0 else 1
            for (v in g[u]) {
                if (p[v] == -1) dfs(v, !even)
                else if (p[u] == p[v]) bad = true
            }
        }
        
        for (u in g.indices) {
            if (p[u] == -1) dfs(u, even=true)
        }
        return !bad
    }
}