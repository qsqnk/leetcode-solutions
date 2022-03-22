class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        pref = list(itertools.accumulate(arr, operator.xor))
        get = lambda q: pref[q[1]] ^ (0 if q[0] == 0 else pref[q[0] - 1])
        return map(get, queries)
        