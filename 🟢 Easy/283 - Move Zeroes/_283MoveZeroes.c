void moveZeroes(int* nums, int numsSize) {
    int countZero = 0;
    int j = 0;
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] == 0) {
            countZero++;
        } else {
            nums[j++] = nums[i];
        }
    }

    for (int i = 0; i < countZero; i++) {
        nums[j++] = 0;
    }
}