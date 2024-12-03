/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function (matrix, target) {
    let m = matrix.length;
    let n = matrix[0].length;
    let row = m - 1, column = 0;

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
};