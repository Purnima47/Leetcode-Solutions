/**
 * @param {number} x
 * @param {number} n
 * @return {number}
 */
var myPow = function (x, n) {
    let ans = 1;

    if (n < 0) {
        x = 1 / x;
        n = Math.abs(n);
    }

    while (n > 0) {
        // LSB = 1 (Then multiply your answer with x)
        if ((n & 1) != 0) {
            ans *= x;
        }

        x *= x;
        n = Math.floor(n / 2);
    }

    return ans;
};