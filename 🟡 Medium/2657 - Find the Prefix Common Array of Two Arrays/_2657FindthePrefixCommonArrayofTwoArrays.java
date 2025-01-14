class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int freq[] = new int[n + 1];
        int res[] = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            freq[A[i]]++;
            if (freq[A[i]] == 2) {
                count++;
            }

            freq[B[i]]++;
            if (freq[B[i]] == 2) {
                count++;
            }

            res[i] = count;
        }

        return res;
    }
}