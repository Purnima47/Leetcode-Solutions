class Solution {
public:
    void flyodWarshall(int n, vector<vector<long long>>& minCost) {

        for (int i = 0; i < n; i++) {
            minCost[i][i] = 0;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    minCost[i][j] =
                        min(minCost[i][j], minCost[i][k] + minCost[k][j]);
                }
            }
        }
    }

    long long minimumCost(string source, string target, vector<char>& original,
                          vector<char>& changed, vector<int>& cost) {
        long long ans = 0;
        int n = 26;
        vector<vector<long long>> minCost(n, vector<long long>(n, INT_MAX));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                minCost[i][j] = INT_MAX;
            }
        }

        for (int i = 0; i < original.size(); i++) {

            int originalCharIdx = original[i] - 'a';
            int changedCharIdx = changed[i] - 'a';

            minCost[originalCharIdx][changedCharIdx] = 
            min(minCost[originalCharIdx][changedCharIdx], (long long)cost[i]);
        }

        flyodWarshall(n, minCost);

        for (int i = 0; i < source.length(); i++) {
            if (source.at(i) == target.at(i)) {
                continue;
            }

            int sourceCharIdx = source.at(i) - 'a';
            int targetCharIdx = target.at(i) - 'a';

            if (minCost[sourceCharIdx][targetCharIdx] >= INT_MAX) {
                return -1;
            }

            ans += minCost[sourceCharIdx][targetCharIdx];
        }

        return ans;
    }
};