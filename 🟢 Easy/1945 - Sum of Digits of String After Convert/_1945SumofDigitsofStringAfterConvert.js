/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */

function transform(str) {
    let ans = 0;
    for (let i = 0; i < str.length; i++) {
        ans += Number(str[i]);
    }
    return ans.toString();
}

var getLucky = function (s, k) {
    let convertedVal = "";
    for (let i = 0; i < s.length; i++) {
        let n = (s.charCodeAt(i) - 97) + 1;
        convertedVal = convertedVal + n.toString();
    }

    while (k > 0) {
        convertedVal = transform(convertedVal);
        k--;
    }

    return parseInt(convertedVal);
};