class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val passed = hashSetOf<Int>()
        val current = ArrayDeque<Int>()
        val permutations = mutableListOf<List<Int>>()
        
        fun dfs(v: Int) {
            passed.add(v)
            current.add(v)
            
            if (current.size == nums.size) permutations.add(current.toList())
            for (u in nums) if (u !in passed) dfs(u)
            
            current.removeLast()
            passed.remove(v)
        }
        
        nums.forEach(::dfs)
        return permutations
    }
}