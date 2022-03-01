class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val triangle = mutableListOf(listOf(1))
        repeat(numRows - 1) {
            val last = triangle.last()
            triangle.add(listOf(1) + last.zipWithNext(Int::plus) + listOf(1))
        }
        return triangle
    }
}