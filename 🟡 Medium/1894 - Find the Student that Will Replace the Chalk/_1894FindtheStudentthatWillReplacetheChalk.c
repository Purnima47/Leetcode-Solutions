int chalkReplacer(int* chalk, int chalkSize, int k) {
    long chalkSum = 0;

    for (int i = 0; i < chalkSize; i++) {
        chalkSum += chalk[i];
    }

    k %= chalkSum;
    int idx;
    for (idx = 0; idx < chalkSize; idx++) {
        if (chalk[idx] > k) {
            return idx;
        } else {
            k -= chalk[idx];
        }
    }

    return idx;
}