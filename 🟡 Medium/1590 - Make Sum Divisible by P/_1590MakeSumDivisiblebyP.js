/**
 * @param {number[]} nums
 * @param {number} p
 * @return {number}
 */
var minSubarray = function (nums, p) {
    let sum = 0;

    for (let num of nums) {
        sum = (sum + num) % p;
    }

    let sumToBeRemoved = sum % p;
    if (sumToBeRemoved == 0) {
        return 0;
    }

    const map = new Map();
    map.set(0, -1);

    let currSum = 0;
    let res = nums.length;
    for (let i = 0; i < nums.length; i++) {
        currSum = (currSum + nums[i]) % p;
        let prefix = (currSum - sumToBeRemoved + p) % p;

        if (map.has(prefix)) {
            res = Math.min(res, i - map.get(prefix));
        }

        map.set(currSum, i);
    }

    return res == nums.length ? -1 : res;
};