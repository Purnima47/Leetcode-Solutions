int missingNumber(int* nums, int numsSize) {
    int xor = numsSize;
    for (int i = 0; i < numsSize; i++) {
        xor ^= nums[i] ^ i;
    }
    return xor;
}