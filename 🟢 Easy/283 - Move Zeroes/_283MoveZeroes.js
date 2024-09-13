/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
    let countZero = 0;
    let j = 0;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            countZero++;
        } else {
            nums[j++] = nums[i];
        }
    }

    for (let i = 0; i < countZero; i++) {
        nums[j++] = 0;
    }
};