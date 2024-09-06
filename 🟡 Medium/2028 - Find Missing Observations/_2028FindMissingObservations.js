/**
 * @param {number[]} rolls
 * @param {number} mean
 * @param {number} n
 * @return {number[]}
 */

var missingRolls = function (rolls, mean, n) {
    let res = new Array(n);
    let sumOfm = 0;
    for (let roll of rolls) {
        sumOfm += roll;
    }
    let sumOfn = mean * (n + rolls.length) - sumOfm;

    if (sumOfn > n * 6 || sumOfn < n) {
        return [];
    }

    if (sumOfn % n == 0 && sumOfn <= n * 6) {
        res.fill(sumOfn / n);
        return res;
    }

    let i = 0;
    while (sumOfn > 0) {
        let num = Math.floor(sumOfn / n);
        res[i++] = num;
        sumOfn -= num;
        n--;
    }

    return res;

};