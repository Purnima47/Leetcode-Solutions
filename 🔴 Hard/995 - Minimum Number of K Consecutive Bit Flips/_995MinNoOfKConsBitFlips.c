int minKBitFlips(int* nums, int numsSize, int k) {
    int w = 0;
    int count = 0;
    bool flipped[numsSize];

    for (int i = 0; i < numsSize; i++) {
        flipped[i] = false;
    }

    for (int i = 0; i < numsSize; i++) {
        if (i >= k) {
            if (flipped[i - k]) {
                w--;
            }
        }
        if (w % 2 == nums[i]) {
            if (i + k > numsSize) {
                return -1;
            }

            w++;
            flipped[i] = true;
            count++;
        }
    }

    return count;
}