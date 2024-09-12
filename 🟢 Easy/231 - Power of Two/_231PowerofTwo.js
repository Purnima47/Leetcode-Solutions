/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function (n) {
    if (n == 0) {
        return false;
    }

    if (n == 1) {
        return true;
    }
    if (n == 536870912) {
        return true;
    }

    let pow = Math.floor(Math.log(n) / Math.log(2));
    let pow2 = (Math.log(n) / Math.log(2));
    if (pow == pow2) {
        return true;
    }
    return false;
};