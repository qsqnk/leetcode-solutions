class Solution {
    fun findTheDifference(s: String, t: String): Char = 
        (s + t).fold(0) { a, x -> a xor x.toInt() }.toChar()
}