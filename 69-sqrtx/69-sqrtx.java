class Solution {
    public int mySqrt(int x) {
        long sq = 0;
        while (sq * sq < x) {
            sq++;
        }
        return sq * sq == x ? (int) sq : (int) (sq - 1);
    }
}