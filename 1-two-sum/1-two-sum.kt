class Solution {
    tailrec fun twoSum(A: IntArray,
                       t: Int,
                       ctx: HashMap<Int, Int> = hashMapOf(),
                       i: Int = 0): IntArray = when (val j = ctx[t - A[i]]) {
        null -> twoSum(A, t, ctx.apply { put(A[i], i) }, i + 1)
        else -> intArrayOf(j, i)
    }
}