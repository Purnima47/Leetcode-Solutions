class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] freq = new long[n];

        for (int[] edge : roads) {
            freq[edge[0]]++;
            freq[edge[1]]++;
        }

        Arrays.sort(freq);

        long imp = 0;
        long k = 1;

        for (long f : freq) {
            imp += (k * f);
            k++;
        }

        return imp;

    }
}