class Solution {
    tailrec fun twoSum(A: IntArray,
                       t: Int,
                       ctx: HashMap<Int, Int> = hashMapOf(),
                       i: Int = 0): IntArray = when {
        t - A[i] in ctx -> intArrayOf(ctx.getOrDefault(t - A[i], -1), i)
        else -> twoSum(A, t, ctx.apply { put(A[i], i) }, i + 1)
    }
}