class Solution {
    fun longestSubsequence(s: String, k: Int): Int {
        var (sum, length) = 0L to 0
        var (sb, upper) = 1L to k.toLong()
        for (i in s.lastIndex downTo 0) {
            val d = if (s[i] == '0') 0 else 1
            if (d == 0 || sum + sb <= upper) {
                length++
                sum += sb * d
                sb = minOf(sb * 2, upper + 1)
            }
        }
        return length
    }
}