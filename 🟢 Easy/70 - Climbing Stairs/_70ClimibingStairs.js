/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function (n) {
    let w0 = 1; // when n == 0 then there is one way
    let w1 = 1; // when n == 1 then there is one way

    for (let i = 2; i < n + 1; i++) {
        // total ways-->tW
        let tW = w0 + w1;
        w0 = w1;
        w1 = tW;
    }
    return w1;
};