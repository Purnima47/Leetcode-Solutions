/**
 * @param {string} num
 * @return {string}
 */
var largestOddNumber = function (num) {
    let i = num.length - 1;
    let to = 0;
    while (i >= 0) {
        if ((num.at(i) - '0') % 2 != 0) {
            to = i + 1;
            break;
        }
        i--;
    }

    return num.substring(0, to);
};