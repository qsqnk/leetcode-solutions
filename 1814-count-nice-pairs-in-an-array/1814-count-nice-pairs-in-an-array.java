class Solution {
    private final int MODULO = 1_000_000_007;
    
    public int countNicePairs(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= rev(nums[i]);
        }
        HashMap<Integer, Integer> count = new HashMap<>();
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += count.getOrDefault(nums[i], 0);
            total %= MODULO;
            count.merge(nums[i], 1, Integer::sum);
        }
        return total;
        
    }
    
    private int rev(int x) {
        int acc = 0;
        for (int y = x; y > 0; y /= 10) {
            acc *= 10;
            acc += y % 10;
        }
        return acc;
    }
}
