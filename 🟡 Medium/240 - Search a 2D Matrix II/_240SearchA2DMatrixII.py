class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        m = len(matrix)
        n = len(matrix[0])
        row, column = m - 1, 0

        while row >= 0 and column < n:
            if matrix[row][column] == target:
                return True
            elif matrix[row][column] > target:
                row -= 1
            else:
                column += 1

        return False
