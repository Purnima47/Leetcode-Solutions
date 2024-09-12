/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
    nums.sort();
    let val = nums[0];
    for (let i = 1; i < nums.length; i++) {
        if (val == nums[i]) {
            return true;
        } else {
            val = nums[i];
        }
    }
    return false;
};