class Solution {
    fun uniquePathsIII(A: Array<IntArray>): Int {
        val dirs = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
        var (start, zeroes) = (0 to 0) to 1
        for (i in A.indices) for (j in A[i].indices) when (A[i][j]) {
            0 -> zeroes++
            1 -> start = i to j
        }
        var ans = 0
        fun helper(i: Int, j: Int) {
            if (i !in A.indices || j !in A[i].indices || A[i][j] < 0) return
            if (zeroes == 0 && A[i][j] == 2) { ans++; return }
            val old = A[i][j].also { A[i][j] = -2; zeroes-- }
            dirs.forEach { (dx, dy) -> helper(i + dx, j + dy) }
            A[i][j] = old; zeroes++
        }
        helper(start.first, start.second)
        return ans
    }

}