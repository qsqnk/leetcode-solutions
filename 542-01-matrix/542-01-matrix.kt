class Solution {
    fun updateMatrix(A: Array<IntArray>): Array<IntArray> {
        val dirs = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
        val dq = ArrayDeque<Pair<Int, Int>>()
        for (i in A.indices) {
            for (j in A[i].indices) {
                if (A[i][j] == 0) dq.add(i to j)
                else A[i][j] = -1
            }
        }
        while (dq.isNotEmpty()) {
            val (i, j) = dq.removeFirst()
            dirs.forEach { (dx, dy) ->
                val (x, y) = i + dx to j + dy
                if (x in A.indices && y in A[i].indices && A[x][y] == -1) {
                    A[x][y] = 1 + A[i][j]
                    dq.add(x to y)
                }
            }
        }
        return A
    }
}