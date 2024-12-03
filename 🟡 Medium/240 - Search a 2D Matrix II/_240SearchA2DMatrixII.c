bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize,
                  int target) {
    int row = matrixSize - 1, column = 0;

    while (row >= 0 && column < *matrixColSize) {
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