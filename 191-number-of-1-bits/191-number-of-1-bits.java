public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int w = 0;
        for (int x = n; x != 0; x >>>= 1) {
            w += x & 1;
        }
        return w;
    }
}