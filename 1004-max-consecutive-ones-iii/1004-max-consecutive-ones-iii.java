class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroes = 0, max = 0, start = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) zeroes++;
            while (zeroes > k) {
                if (nums[start++] == 0) zeroes--;
            }
            max = Math.max(end - start + 1, max);
        }
        return max;
    }
}