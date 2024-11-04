/**
 * @param {string} s
 * @return {string}
 */
var makeFancyString = function (s) {
    let prev = s[0];
    let count = 1;
    let res = s[0];

    for (let i = 1; i < s.length; i++) {
        if (s.charAt(i) === prev) {
            count++;
        } else {
            count = 1;
            prev = s.charAt(i);
        }

        if (count < 3) {
            res += s.charAt(i);
        }
    }

    return res;
};