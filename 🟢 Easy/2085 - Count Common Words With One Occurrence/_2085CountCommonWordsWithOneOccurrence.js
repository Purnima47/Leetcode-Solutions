/**
 * @param {string[]} words1
 * @param {string[]} words2
 * @return {number}
 */
var countWords = function (words1, words2) {
    let map1 = new Map();
    let map2 = new Map();

    let count = 0;

    for (let str of words1) {
        if (map1.has(str)) {
           map1.set(str, map1.get(str) + 1);
        } else {
            map1.set(str, 1);
        }
    }

    for (let str of words2) {
        if (map2.has(str)) {
            map2.set(str, map2.get(str) + 1);
        } else {
            map2.set(str, 1);
        }
    }

    for (let str of words1) {
        if (map1.get(str) == 1 && map2.has(str)) {
            if (map2.get(str) == 1) {
                count++;
            }
        }
    }

    return count;
};