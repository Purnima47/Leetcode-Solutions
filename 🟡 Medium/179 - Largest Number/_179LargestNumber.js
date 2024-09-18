/**
 * @param {number[]} nums
 * @return {string}
 */
var largestNumber = function (nums) {
    let list = [];
    for (let num of nums) {
        list.push(num.toString());
    }

    list.sort((a, b) => ((b + a) - (a + b)));
    if (list[0] === "0") {
        return "0";
    }

    let res = "";
    for (let str of list) {
        res += str;
    }
    return res;
};