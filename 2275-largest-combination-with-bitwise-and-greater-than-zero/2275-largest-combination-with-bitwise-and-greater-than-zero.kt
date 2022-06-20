class Solution {
    fun largestCombination(candidates: IntArray): Int {
        val bitCount = IntArray(31)
        for (x in candidates) {
            for (i in 0 until 31) if (x and (1 shl i) > 0) bitCount[i]++
        }
        return bitCount.max() ?: 0
    }
}