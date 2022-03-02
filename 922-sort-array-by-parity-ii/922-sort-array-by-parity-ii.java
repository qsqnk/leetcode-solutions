class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        var sorted = new int[nums.length];
        var evenFree = 0;
        var oddFree = 1;
        for (var e : nums) {
            if (e % 2 == 0) {
                sorted[evenFree] = e;
                evenFree += 2;
            } else {
                sorted[oddFree] = e;
                oddFree += 2;
            }
        }
        return sorted;
    }
}