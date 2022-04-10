class Solution {
    fun areAlmostEqual(s1: String, s2: String): Boolean {
        val nonEq = s1.indices.filter { s1[it] != s2[it] }
        return nonEq.size == 0 || nonEq.size == 2 && run {
            val (left, right) = nonEq
            s1[left] == s2[right] && s1[right] == s2[left]
        }
    }
}