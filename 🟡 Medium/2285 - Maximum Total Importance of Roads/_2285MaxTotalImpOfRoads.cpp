class Solution {
public:
    long long maximumImportance(int n, vector<vector<int>>& roads) {
        vector<long long> freq(n);

        for (vector<int>& edge : roads) {
            freq[edge[0]]++;
            freq[edge[1]]++;
        }

        sort(freq.begin(), freq.end());

        long imp = 0;
        long k = 1;

        for (long f : freq) {
            imp += (k * f);
            k++;
        }

        return imp;
    }
};