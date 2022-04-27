import kotlin.math.abs

class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        for (x in nums) nums[abs(x) - 1] = -nums[abs(x) - 1]
        return nums.filter { nums[abs(it) - 1] > 0 }.map(::abs).distinct()
    }
}