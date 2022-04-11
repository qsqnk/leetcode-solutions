class Solution {
    fun minOperations(s: String): Int {
        val fz = CharArray(s.length) { i -> if (i % 2 == 0) '0' else '1' }
        val fo = CharArray(s.length) { i -> if (i % 2 != 0) '0' else '1' }
        return minOf(
            s.indices.count { i -> s[i] != fz[i] },
            s.indices.count { i -> s[i] != fo[i] }
        )
    }
}