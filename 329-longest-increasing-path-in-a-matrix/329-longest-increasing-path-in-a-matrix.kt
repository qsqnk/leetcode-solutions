class Solution {
    private val dirs = listOf(-1 to 0, 1 to 0, 0 to 1, 0 to -1)

    fun longestIncreasingPath(matrix: Array<IntArray>): Int {
        val (m, n) = matrix.size to matrix.first().size
        val dp = Array(m) { IntArray(n) { 0 } }
        var mx = 0

        fun solveFor(i: Int, j: Int): Int {
            if (dp[i][j] != 0) return dp[i][j]
            dp[i][j] = dirs.fold(1) { acc, dir ->
                val (ii, jj) = i + dir.first to j + dir.second
                maxOf(acc, 
                      if (ii in dp.indices && jj in dp[0].indices && matrix[i][j] < matrix[ii][jj])
                      1 + solveFor(ii, jj) 
                      else acc)
                
            }
            return dp[i][j]
        }

        matrix.indices.forEach { i -> matrix[i].indices.forEach { j -> mx = maxOf(mx, solveFor(i, j)) } }

        return mx
    }
}