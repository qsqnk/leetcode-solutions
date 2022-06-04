class Solution {
    public int longestSubarray(int[] a) {
        int i = 0, zero = 0, ans = 0;
        for (int j = 0; j < a.length; j++) {
            zero += 1 - a[j];
            while (zero > 1) zero -= 1 - a[i++];
            ans = Math.max(ans, j - i);
        }
        return ans;
    }
}