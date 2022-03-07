class Solution {
    public int mySqrt(int x) {
        long lo = 0;
        long hi = x;
        while (lo <= hi) {
            var mid = lo + (hi - lo) / 2;
            if (mid * mid > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return (int) hi;
    }
}