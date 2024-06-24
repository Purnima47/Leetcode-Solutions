class Solution {
public:
    int longestSubarray(vector<int>& nums, int limit) {
        deque<int> inc;
        deque<int> dec;
        int l = 0;
        int res = 0;

        for (int r = 0; r < nums.size(); r++) {
            while (!inc.empty() && inc.back() > nums[r]) {
                inc.pop_back();
            }

            inc.push_back(nums[r]);

            while (!dec.empty() && dec.back() < nums[r]) {
                dec.pop_back();
            }

            dec.push_back(nums[r]);

            while (dec.front() - inc.front() > limit) {
                if (dec.front() == nums[l]) {
                    dec.pop_front();
                }
                if (inc.front() == nums[l]) {
                    inc.pop_front();
                }
                l++;
            }
            res = max(res, r - l + 1);
        }
        return res;
    }
};