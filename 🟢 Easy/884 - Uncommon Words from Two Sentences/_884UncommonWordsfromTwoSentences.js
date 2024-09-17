/**
 * @param {string} s1
 * @param {string} s2
 * @return {string[]}
 */
var uncommonFromSentences = function (s1, s2) {
    let s = s1 + " " + s2;
    let arr = s.split(" ");
    let map = new Map();

    for (let str of arr) {
        if (map.has(str)) {
            map.set(str, map.get(str) + 1);
        } else {
            map.set(str, 1);
        }
    }

    let res = [];
    map.forEach((value, key) => {
        if (value == 1) {
            res.push(key);
        }
    });

    return res;
};