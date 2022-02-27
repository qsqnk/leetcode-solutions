class Solution {
    public int[][] generateMatrix(int n) {
        var spiral = new int[n][n];
        int lo = 0;
        int hi = n - 1;
        int cnt = 1;
        
        while (lo <= hi) {
            if (lo == hi) {
                spiral[lo][hi] = cnt;
                break;
            }
            for (int j = lo; j <= hi; j++) {
                spiral[lo][j] = cnt++;
            }
            for (int i = lo + 1; i <= hi - 1; i++) {
                spiral[i][hi] = cnt++;
            }
            for (int j = hi; j >= lo; j--) {
                spiral[hi][j] = cnt++;
            }
            for (int i = hi - 1; i > lo; i--) {
                spiral[i][lo] = cnt++;
            }
            lo++;
            hi--;
        }
        return spiral;
    }
}

