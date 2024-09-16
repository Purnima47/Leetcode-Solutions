/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* xorQueries(int* arr, int arrSize, int** queries, int queriesSize,
                int* queriesColSize, int* returnSize) {
    int* res;
    res = malloc(queriesSize * sizeof(int));
    *returnSize = 0;
    for (int i = 0; i < queriesSize; i++) {
        int left = queries[i][0];
        int right = queries[i][1];
        int xorOfElem = arr[left];
        while (left < right) {
            left++;
            xorOfElem ^= arr[left];
        }
        res[*returnSize] = xorOfElem;
        (*returnSize)++;
    }
    return res;
}