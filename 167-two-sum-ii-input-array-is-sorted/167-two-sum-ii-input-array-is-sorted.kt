class Solution {
    tailrec fun twoSum(A: IntArray, t: Int, l: Int = 0, r: Int = A.size - 1): IntArray = when {
        A[l] + A[r] < t -> twoSum(A, t, l + 1, r) 
        A[l] + A[r] > t -> twoSum(A, t, l, r - 1)
        else -> intArrayOf(l + 1, r + 1)
    }
}