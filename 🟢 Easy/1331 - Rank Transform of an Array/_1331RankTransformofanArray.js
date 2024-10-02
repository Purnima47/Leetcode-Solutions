/**
 * @param {number[]} arr
 * @return {number[]}
 */
var arrayRankTransform = function (arr) {
    const set = new Set(arr);
    const sortedArr = [...set].sort((a, b) => a - b);

    let map = new Map();
    let r = 1;

    for (let el of sortedArr) {
        map.set(el, r);
        r++;
    }


    for (let i = 0; i < arr.length; i++) {
        arr[i] = map.get(arr[i]);
    }

    return arr;
};