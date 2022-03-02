class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var (max, zeroes, start) = listOf(0, 0, 0)
        for ((end, e) in nums.withIndex()) {
            if (e == 0) zeroes++
            while (zeroes > k) if (nums[start++] == 0) zeroes--
            max = maxOf(max, end - start + 1)
        }
        return max
    }
}