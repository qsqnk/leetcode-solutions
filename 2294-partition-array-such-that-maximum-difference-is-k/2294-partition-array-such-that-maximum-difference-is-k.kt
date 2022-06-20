class Solution {
    fun partitionArray(nums: IntArray, k: Int): Int {
        nums.sort()
        var (lo, hi) = 0 to 0
        var count = 0
        while (hi < nums.size) {
            while (hi < nums.size && nums[hi] - nums[lo] <= k) hi++
            count++
            lo = hi
        }
        return count
    }
}