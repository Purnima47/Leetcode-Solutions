class Solution {
public:
    vector<vector<int>> restoreMatrix(vector<int>& rowSum,
                                      vector<int>& colSum) {
        int rowLen = rowSum.size();
        int colLen = colSum.size();

        vector<int> currRowSum(rowLen);
        vector<int> currColSum(colLen);

        vector<vector<int>> origMatrix(rowLen, vector<int>(colLen));
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                origMatrix[i][j] =
                    min(rowSum[i] - currRowSum[i], colSum[j] - currColSum[j]);

                currRowSum[i] += origMatrix[i][j];
                currColSum[j] += origMatrix[i][j];
            }
        }
        return origMatrix;
    }
};