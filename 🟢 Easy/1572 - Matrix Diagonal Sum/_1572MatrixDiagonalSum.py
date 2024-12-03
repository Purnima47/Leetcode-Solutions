class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        n = len(mat)
        ans = 0

        for i in range(0, n):
            ans += mat[i][i]

            if i != n - 1 - i:
                ans += mat[i][n - i - 1]

        return ans
