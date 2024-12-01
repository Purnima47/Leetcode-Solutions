/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function (nums) {
    // KADANE'S ALGORITHM
    let cs = 0;
    let maxSum = -Infinity;

    for (let num of nums) {
        cs += num;
        maxSum = Math.max(maxSum, cs);

        if (cs < 0) {
            cs = 0;
        }
    }

    return maxSum;
};