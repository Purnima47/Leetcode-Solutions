/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
    if (s.length != t.length) {
        return false;
    }
    let sArr = s.split("");
    let tArr = t.split("");

    sArr.sort();
    tArr.sort();

    if (JSON.stringify(sArr) == JSON.stringify(tArr)) {
        return true;
    }

    return false;
};