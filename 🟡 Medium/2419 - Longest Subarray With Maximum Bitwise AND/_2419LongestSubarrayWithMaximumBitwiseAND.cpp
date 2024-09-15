class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int maxi = 0;
        int currLongestSeq = 0;
        int res = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (maxi < nums[i]) {
                maxi = nums[i];
                currLongestSeq = 0;
                res = 0;
            }

            if (maxi == nums[i]) {
                currLongestSeq++;
            } else {
                currLongestSeq = 0;
            }

            res = max(res, currLongestSeq);
        }
        return res;
    }
};