/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function (nums) {
    let xor = nums.length;
    for (let i = 0; i < nums.length; i++) {
        xor ^= nums[i] ^ i;
    }
    return xor;
};