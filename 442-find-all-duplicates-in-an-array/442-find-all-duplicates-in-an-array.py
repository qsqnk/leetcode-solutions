class Solution:
    def findDuplicates(self, A):
        for x in A: A[abs(x) - 1] = -A[abs(x) - 1]
        return set(abs(x) for x in A if A[abs(x) - 1] > 0)
        