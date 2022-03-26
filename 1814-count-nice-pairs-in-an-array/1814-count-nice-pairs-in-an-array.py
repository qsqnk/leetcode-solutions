class Solution:
    def countNicePairs(self, nums: List[int]) -> int:
        def rev(x, acc=0): return acc if not x else rev(x // 10, acc * 10 + x % 10)
        counter = Counter(map(lambda x: x - rev(x), nums))
        return sum(c * (c - 1) // 2 for c in counter.values()) % 1_000_000_007
        