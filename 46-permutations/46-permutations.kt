class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val passed = hashSetOf<Int>()
        val curPerm = ArrayDeque<Int>()
        val perms = mutableListOf<List<Int>>()
        
        fun fill(v: Int) {
            passed.add(v)
            curPerm.add(v)
            
            if (curPerm.size == nums.size) perms.add(curPerm.toList())
            
            nums.filterNot(passed::contains).forEach(::fill)
            
            curPerm.removeLast()
            passed.remove(v)
        }
        
        return perms.apply { nums.forEach(::fill) }
    }
}