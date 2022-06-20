class Solution:
    def arrayChange(self, arr, ops) -> List[int]:
        r = {}
        for f, t in ops[::-1]: r[f] = r.get(t, t)
        return [r.get(x, x) for x in arr]
            
        