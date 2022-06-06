class Solution:
    def trap(self, a: List[int]) -> int:
        max_p, max_s, n, ans = [*a], [*a], len(a), 0
        for i in range(1, n):
            max_p[i] = max(max_p[i], max_p[i - 1])
            max_s[n - i - 1] = max(max_s[n - i - 1], max_s[n - i])
        for i in range(1, n - 1):
            ans += max(0, min(max_p[i - 1], max_s[i + 1]) - a[i])
        return ans
        
        

