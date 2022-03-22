class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        p = list(accumulate(arr, operator.xor))
        return map(lambda q: (p[q[1]], p[q[0] - 1] ^ p[q[1]])[q[0] > 0], queries)
        