var minKBitFlips = function (nums, k) {
    let n = nums.length;
    let w = 0;
    let count = 0;
    let flipped = [];

    for (let i = 0; i < n; i++) {
        if (i >= k) {
            if (flipped[i - k]) {
                w--;
            }
        }
        if (w % 2 == nums[i]) {
            if (i + k > n) {
                return -1;
            }

            w++;
            flipped[i] = true;
            count++;
        }
    }

    return count;
};