class Solution {
    fun singleNumber(a: IntArray) = a.reduce(Int::xor)
}