class Solution {
    private val MODULO = 1000000007L
    
    fun numRollsToTarget(n: Int, k: Int, target: Int): Int {
        var onPrev = LongArray(target + 1) { if (it <= k && it > 0) 1L else 0L }
        repeat(n - 1) {
            val new = LongArray(target + 1)
            for (t in 1..target) {
                for (r in 1..k) {
                    new[t] += onPrev.getOrElse(t - r) { 0 }
                    new[t] = new[t] % MODULO
                }
            }
            onPrev = new
        }
        return onPrev[target].toInt()
    }
}