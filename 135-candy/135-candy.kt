class Solution {
    fun candy(ratings: IntArray): Int {
        val candies = IntArray(ratings.size) { 1 }
        val sorted = ratings.withIndex().sortedBy { it.value }
        for ((i, _) in sorted) {
            var count = 1
            if (i > 0 && ratings[i - 1] < ratings[i]) 
                count = candies[i - 1] + 1
            if (i < ratings.lastIndex && ratings[i] > ratings[i + 1]) 
                count = maxOf(count, candies[i + 1] + 1)
            candies[i] = count
        }
        return candies.sumBy { it } ?: 0
    }
}