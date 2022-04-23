class Solution {
    fun minimumRounds(tasks: IntArray): Int {
        val countAtLevel = hashMapOf<Int, Int>()
        tasks.forEach { countAtLevel.merge(it, 1) { x, y -> x + y } }
        var time = 0
        for ((_, count) in countAtLevel) {
            when {
                count == 1 -> return -1
                count % 3 == 0 -> time += count / 3 
                count % 3 == 1 -> time += count / 3 + 1
                count % 3 == 2 -> time += count / 3 + 1
            }
        }
        return time
    }
}