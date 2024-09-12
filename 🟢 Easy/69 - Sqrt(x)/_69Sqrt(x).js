/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function (x) {
    let num = 1;
    while (Math.floor(x / num) > num) {
        num++;
    }
    if (Math.floor(x / num) == num)
        return num;
    else
        return num - 1;
};