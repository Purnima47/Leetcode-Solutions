int longestSubarray(int* nums, int numsSize) {
    int maxi = 0;
    int currLongestSeq = 0;
    int res = 0;

    for (int i = 0; i < numsSize; i++) {
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

        res = fmax(res, currLongestSeq);
    }
    return res;
}