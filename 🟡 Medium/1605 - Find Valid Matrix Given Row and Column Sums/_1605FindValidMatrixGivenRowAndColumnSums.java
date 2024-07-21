class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rowLen = rowSum.length;
        int colLen = colSum.length;

        int[] currRowSum = new int[rowLen];
        int[] currColSum = new int[colLen];

        int[][] origMatrix = new int[rowLen][colLen];
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                origMatrix[i][j] = Math.min(rowSum[i] - currRowSum[i], colSum[j] - currColSum[j]);

                currRowSum[i] += origMatrix[i][j];
                currColSum[j] += origMatrix[i][j];
            }
        }
        return origMatrix;
    }
}