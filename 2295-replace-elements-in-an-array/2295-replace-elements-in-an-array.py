class Solution:
    def arrayChange(self, a, o) -> List[int]:
        r = {}
        for f, t in o[::-1]: r[f] = r.get(t, t)
        return [r.get(x, x) for x in a]
            
        