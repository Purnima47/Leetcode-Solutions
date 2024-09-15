/**
 * @param {number[]} nums
 * @return {number}
 */
var longestSubarray = function (nums) {
    let maxi = 0;
    let currLongestSeq = 0;
    let res = 0;

    for (let i = 0; i < nums.length; i++) {
        if (maxi < nums[i]) {
            maxi = nums[i];
            currLongestSeq = 0;
            res = 0;
        }

        if (maxi == nums[i]) {
            currLongestSeq++;
        } else {
            currLongestSeq = 0;
        }

        res = Math.max(res, currLongestSeq);
    }
    return res;
};