class Solution {
    public int numIdenticalPairs(int[] nums) {
        var counter = new HashMap<Integer, Integer>();
        var count = 0;
        for (var e : nums) {
            var c = counter.getOrDefault(e, 0);
            count += c;
            counter.put(e, c + 1);
        }
        return count;
    }
}