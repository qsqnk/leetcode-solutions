class Solution:
    def validPath(self, n, edges, s, d) -> bool:
        g = [[] for _ in range(n)]
        for e in edges:
            g[e[0]].append(e[1])
            g[e[1]].append(e[0])
        level, passed = [s], {s}
        while level:
            if any(n == d for n in level): return True
            level = [c for n in level for c in g[n] if c not in passed]
            for n in level: passed.add(n)
        return False
        
        