class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        int n = nums.length;
        for (int m = 0; m < 1 << n; m++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((m & 1 << i) > 0) subset.add(nums[i]);
            }
            subsets.add(subset);
        }
        return subsets;
    }
}