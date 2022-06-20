class Solution {
    fun arrayChange(nums: IntArray, operations: Array<IntArray>): IntArray {
        val replaces = hashMapOf<Int, Int>()
        for ((from, to) in operations.reversed()) {
            replaces[from] = replaces[to] ?: to
        }
        return nums.map { replaces[it] ?: it }.toIntArray()        
    }
}