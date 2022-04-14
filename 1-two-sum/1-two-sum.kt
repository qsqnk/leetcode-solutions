class Solution {
    tailrec fun twoSum(A: IntArray,
                       t: Int,
                       ctx: Map<Int, Int> = hashMapOf(),
                       i: Int = 0): IntArray = when {
        t - A[i] in ctx -> intArrayOf(ctx.getOrDefault(t - A[i], -1), i)
        else -> twoSum(A, t, ctx + (A[i] to i), i + 1)
    }
}