/**
 * @param {string} s
 * @return {number}
 */
var minimumSteps = function (s) {
    let res = 0;
    let whitePos = 0;
    let zero = 0;

    while (zero < s.length) {
        if (s[zero] == '0') {
            res += (zero - whitePos);
            whitePos++;
        }
        zero++;
    }

    return res;
};