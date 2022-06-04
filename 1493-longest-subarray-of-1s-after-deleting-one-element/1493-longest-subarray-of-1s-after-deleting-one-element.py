class Solution:
    def longestSubarray(self, a: List[int]) -> int:
        ans = zeros = lo = 0
        for hi, x in enumerate(a):
            zeros += 1 - x
            while zeros > 1:
                zeros -= 1 - a[lo]
                lo += 1
            ans = max(ans, hi - lo)
        return ans
            
            
        