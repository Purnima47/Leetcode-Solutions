/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @return {number}
 */
var longestCommonPrefix = function (arr1, arr2) {
    let res = 0;

    const prefixesOfarr1 = new Set();

    for (let el of arr1) {
        while (!prefixesOfarr1.has(el) && el > 0) {
            prefixesOfarr1.add(el);
            el = Math.floor(el / 10);
        }
    }

    for (let el of arr2) {
        while (!prefixesOfarr1.has(el) && el > 0) {
            el = Math.floor(el / 10);
        }

        if (el > 0) {
            res = Math.max(res, Math.floor(Math.log10(el) + 1));
        }
    }

    return res;
};