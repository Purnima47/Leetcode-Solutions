class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> num1(nums1.begin(), nums1.end());
        unordered_set<int> num2(nums2.begin(), nums2.end());

        vector<int> res;
        for (auto& n : num1) {
            if (num2.find(n) != num2.end()) {
                res.push_back(n);
            }
        }

        return res;
    }
};