class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int val = nums[0];
        for (int i = 1; i < nums.size(); i++) {
            if (val == nums[i]) {
                return true;
            } else {
                val = nums[i];
            }
        }
        return false;
    }
};