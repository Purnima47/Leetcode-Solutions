/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function (mat) {
    let n = mat.length;
    let sum = 0;

    for (let i = 0; i < n; i++) {
        // pd
        sum += mat[i][i];

        // sd + overlapping condition
        if (i != n - 1 - i) {
            sum += mat[i][n - i - 1];
        }
    }

    return sum;
};