/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function (a, b) {
    let sum = "";
    let carry = 0;
    let i = a.length - 1;
    let j = b.length - 1;

    while (i >= 0 || j >= 0 || carry == 1) {
        if (i >= 0) {
            carry += a.at(i) - '0';
            i--;
        }

        if (j >= 0) {
            carry += b.at(j) - '0';
            j--;
        }

        sum += carry % 2;
        carry = Math.floor(carry / 2);
    }

    return sum.split("").reverse().join("");
};