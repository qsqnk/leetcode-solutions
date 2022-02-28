class Solution {
    public String customSortString(String order, String s) {
        var cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        var ans = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            var c = order.charAt(i);
            var count = cnt[c - 'a'];
            for (int j = 0; j < count; j++) {
                ans.append(c);
            }
            cnt[c - 'a'] = 0;
        }
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                ans.append((char)('a' + i));
            }
        }
        return ans.toString();
    }
}