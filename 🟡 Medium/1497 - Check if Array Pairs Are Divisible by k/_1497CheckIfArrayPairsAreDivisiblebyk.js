/**
 * @param {number[]} arr
 * @param {number} k
 * @return {boolean}
 */
var canArrange = function (arr, k) {
    let freq = new Array(k).fill(0);

    for (let el of arr) {
        let modulo = ((el % k) + k) % k;
        freq[modulo] += 1;
    }

    if (freq[0] % 2 != 0) {
        return false;
    }

    for (let i = 1; i <= Math.floor(k / 2); i++) {

        if (freq[i] != freq[k - i]) {
            return false;
        }
    }

    return true;
};