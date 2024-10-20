/**
 * @param {number[]} num
 * @param {number} k
 * @return {number[]}
 */
var addToArrayForm = function (num, k) {
    let res = [];
    let i = num.length - 1;

    while (i >= 0 || k > 0) {
        if (i >= 0) {
            k += num[i];
        }
        res.push(k % 10);
        k = Math.floor(k / 10);
        i--;
    }

    res.reverse();
    return res;
};