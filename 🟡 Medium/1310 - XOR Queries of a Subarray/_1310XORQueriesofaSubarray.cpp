class Solution {
public:
    vector<int> xorQueries(vector<int>& arr, vector<vector<int>>& queries) {
        vector<int> res(queries.size());
        int i = 0;
        for (auto& query : queries) {
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
};