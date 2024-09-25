class Solution {
public:
    int longestCommonPrefix(vector<int>& arr1, vector<int>& arr2) {
        int res = 0;

        unordered_set<int> prefixesOfarr1;

        for (auto& el : arr1) {
            while (!prefixesOfarr1.count(el) && el > 0) {
                prefixesOfarr1.insert(el);
                el /= 10;
            }
        }

        for (auto& el : arr2) {
            while (!prefixesOfarr1.count(el) && el > 0) {
                el /= 10;
            }

            if (el > 0) {
                res = max(res, (int)floor(log10(el) + 1));
            }
        }

        return res;
    }
};