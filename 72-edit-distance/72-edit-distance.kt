class Solution {
    fun minDistance(word1: String, word2: String): Int {
        val memo = Array(word1.length + 1) { IntArray(word2.length + 1) { -1 } }
        fun helper(i: Int, j: Int): Int {
            if (i == 0 || j == 0) return i + j
            if (memo[i][j] != -1) return memo[i][j]
            memo[i][j] = minOf(
                1 + helper(i - 1, j),
                1 + helper(i, j - 1),
                helper(i - 1, j - 1) + if (word1[i - 1] == word2[j - 1]) 0 else 1
            )
            return memo[i][j]
        }
        return helper(word1.length, word2.length)
    }
}