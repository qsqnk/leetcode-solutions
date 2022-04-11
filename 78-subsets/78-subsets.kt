class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val subsets = arrayListOf<List<Int>>()
        for (m in 0 until (1 shl nums.size)) {
            val subset = arrayListOf<Int>()
            for (i in nums.indices) {
                if (m and (1 shl i) > 0) subset.add(nums[i])
            }
            subsets.add(subset)
        }
        return subsets
    }
}