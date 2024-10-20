class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        vector<int> res;
        int i = num.size() - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
            }
            res.push_back(k % 10);
            k /= 10;
            i--;
        }
        reverse(res.begin(), res.end());
        return res;
    }
};