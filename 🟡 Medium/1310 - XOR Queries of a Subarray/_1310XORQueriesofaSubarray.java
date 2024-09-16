class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int res[] = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            int xorOfElem = arr[left];
            while (left < right) {
                left++;
                xorOfElem ^= arr[left];
            }
            res[i++] = xorOfElem;
        }
        return res;
    }
}