class Solution:
    def xorQueries(self, A, qs):
        p = list(accumulate(A, xor))
        return map(lambda q: (p[q[1]], p[q[0] - 1] ^ p[q[1]])[q[0] > 0], qs)
        