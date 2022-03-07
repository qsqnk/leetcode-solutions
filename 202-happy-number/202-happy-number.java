class Solution {
    public boolean isHappy(int n) {
        var passed = new HashSet<Integer>();
        var current = n;
        while (current != 1) {
            if (passed.contains(current)) {
                return false;
            }
            passed.add(current);
            current = transform(current);
        }
        return true;
    }
    
    private int transform(int n) {
        var sum = 0;
        for (int x = n; x > 0; x /= 10) {
            sum += (x % 10) * (x % 10);
        }
        return sum;
    }
}