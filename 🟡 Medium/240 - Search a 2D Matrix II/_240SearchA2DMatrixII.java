class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = m - 1, column = 0;

        while (row >= 0 && column < n) {
            if (matrix[row][column] == target) {
                return true;
            } else if (matrix[row][column] > target) {
                // move to top
                row--;
            } else {
                // move to right
                column++;
            }
        }

        return false;
    }
}