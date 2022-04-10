class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                balance++;
            } else if (s.charAt(i) == ')') {
                if (balance > 0) {
                    balance--;
                } else {
                    count++;
                }
            }
        }
        return count + balance;
    }
}