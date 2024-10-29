/**
 * @param {number[]} nums
 * @return {boolean}
 */
var canAliceWin = function (nums) {
    let aSum = 0;
    let bSum = 0;
    for (let i = 0; i < nums.length; i++) {
            let div = Math.floor(nums[i] / 10);
        if (div == 0) {
            aSum += nums[i];
        } else {
            bSum += nums[i];
        }
    }

    if (aSum != bSum) {
        return true;
    }
    return false;
};