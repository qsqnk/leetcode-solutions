class Solution {
    fun maximumProduct(A: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>(compareBy(A::get))
        A.indices.forEach { pq.add(it) }
        repeat(k) {
            val minIndex = pq.poll()
            A[minIndex]++
            pq.add(minIndex)
        }
        return A.fold(1L) { acc, x -> acc * x % 1000000007 }.toInt()
    }
}