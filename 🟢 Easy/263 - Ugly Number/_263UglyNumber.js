/**
 * @param {number} n
 * @return {boolean}
 */
var isUgly = function (n) {
    if (n <= 0) {
        return false;
    }

    let primeFactors = [2, 3, 5];
    for (let prime of primeFactors) {
        while (n % prime == 0) {
            n /= prime;
        }
    }

    // if 1 occurs then it is "UGLY NUMBER".
    return n == 1;
};