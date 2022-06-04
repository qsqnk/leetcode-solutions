class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        longest = zeroes = start = 0
        for end, x in enumerate(nums):
            zeroes += 1 - x
            while zeroes > 1:
                zeroes -= 1 - nums[start]
                start += 1
            longest = max(longest, end - start)
        return longest
            
            
        