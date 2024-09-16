/**
 * @param {number[]} arr
 * @param {number[][]} queries
 * @return {number[]}
 */
var xorQueries = function (arr, queries) {
    let res = [];
    let i = 0;
    for (let query of queries) {
        let left = query[0];
        let right = query[1];
        let xorOfElem = arr[left];
        while (left < right) {
            left++;
            xorOfElem ^= arr[left];
        }
        res[i++] = xorOfElem;
    }
    return res;
};