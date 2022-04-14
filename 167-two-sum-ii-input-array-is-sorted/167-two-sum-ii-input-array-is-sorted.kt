class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var (lo, hi) = 0 to numbers.lastIndex
        while (lo < hi) {
            if (numbers[lo] + numbers[hi] < target) lo++
            else if (numbers[lo] + numbers[hi] > target) hi--
            else break
        }
        return intArrayOf(lo + 1, hi + 1)
    }
}