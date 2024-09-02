class Solution {
public:
    int chalkReplacer(vector<int>& chalk, int k) {
        long chalkSum = 0;

        for (int chalkPiece : chalk) {
            chalkSum += chalkPiece;
        }

        k %= chalkSum;
        int idx;
        for (idx = 0; idx < chalk.size(); idx++) {
            if (chalk[idx] > k) {
                return idx;
            } else {
                k -= chalk[idx];
            }
        }

        return idx;
    }
};