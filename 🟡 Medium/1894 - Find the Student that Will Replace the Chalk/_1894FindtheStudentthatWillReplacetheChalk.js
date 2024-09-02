/**
 * @param {number[]} chalk
 * @param {number} k
 * @return {number}
 */
var chalkReplacer = function (chalk, k) {
    let chalkSum = 0;

    for (let chalkPiece of chalk) {
        chalkSum += chalkPiece;
    }

    k %= chalkSum;
    let idx;
    for (idx = 0; idx < chalk.length; idx++) {
        if (chalk[idx] > k) {
            return idx;
        } else {
            k -= chalk[idx];
        }
    }

    return idx;
};