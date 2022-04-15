/** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
        var (lo, hi) = 1 to n
        guess@while (true) {
            val g = lo + (hi - lo) / 2
            when (guess(g)) {
                -1 -> hi = g - 1
                1 -> lo = g + 1
                0 -> break@guess
            }
        }
        return lo + (hi - lo) / 2
    }
}