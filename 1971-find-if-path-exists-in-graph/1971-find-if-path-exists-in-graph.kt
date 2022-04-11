class Solution {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        val g = Array(n) { arrayListOf<Int>() }
        edges.forEach { (u, v) ->
            g[u].add(v)
            g[v].add(u)
        }
        val passed = hashSetOf(source)
        var level = listOf(source)
        while (level.isNotEmpty()) {
            if (level.any(destination::equals)) return true 
            level = level.flatMap(g::get).filterNot(passed::contains)
            passed.addAll(level)
        }
        return false
    }
}