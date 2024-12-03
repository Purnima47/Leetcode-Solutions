int diagonalSum(int** mat, int matSize, int* matColSize) {
    int n = matSize;
    int sum = 0;

    for (int i = 0; i < n; i++) {
        // pd
        sum += mat[i][i];

        // sd + overlapping condition
        if (i != n - 1 - i) {
            sum += mat[i][n - i - 1];
        }
    }

    return sum;
}