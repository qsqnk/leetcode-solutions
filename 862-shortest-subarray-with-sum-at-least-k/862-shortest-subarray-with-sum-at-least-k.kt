import java.util.*

class Solution {
    fun shortestSubarray(nums: IntArray, k: Int): Int {
        val p = nums.copyOf().map(Int::toLong).toLongArray()
        for (i in 1 until p.size) p[i] += p[i - 1]
        var min = p.indexOfFirst { it >= k }.let { if (it == -1) Int.MAX_VALUE else it + 1 }
        val l = IntArray(nums.size) { -1 }
        val ts = TreeSet<Pair<Int, Long>>(compareBy { it.second }).apply { add(0 to p[0]) }
        for (j in 1 until p.size) {
            ts.floor(-1 to p[j] - k)?.let { (i, _) ->
                l[j] = i
            }
            var ceiling = ts.ceiling(-1 to p[j])
            while (ceiling != null) {
                ts.remove(ceiling)
                ceiling = ts.ceiling(-1 to p[j])
            }
            ts.add(j to p[j])
        }
        val res = minOf(
            min,
            l.withIndex()
                .filter { it.value != -1 }
                .fold(Int.MAX_VALUE) { acc, (r, l) -> minOf(acc, r - l) })
        return if (res != Int.MAX_VALUE) res else -1
    }
}

/**

1) ans = min(i + 1 | p[i] >= k)

2) 0 <= i < j < n

p[j] - p[i] >= k

foreach j findlast p[i] such that p[i] <= p[j] - k


 **/