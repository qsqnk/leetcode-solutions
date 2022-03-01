class Solution:
    def generate(self, N: int) -> List[List[int]]:
        triangle = [[1]]
        for row in range(1, N):
            last = triangle[-1]
            triangle.append([1] + [x+y for x,y in zip(last, last[1:])] + [1])
        return triangle