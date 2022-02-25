class Solution {
    public int countKDifference(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        var count = 0;
        for (var e : nums) {
            count += map.getOrDefault(e - k, 0) + map.getOrDefault(e + k, 0);
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        return count;
    }
}