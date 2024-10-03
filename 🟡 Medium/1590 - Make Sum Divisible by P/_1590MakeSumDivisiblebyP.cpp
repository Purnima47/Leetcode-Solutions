class Solution {
public:
    int minSubarray(vector<int>& nums, int p) {
        int sum = 0;

        for (auto& num : nums) {
            sum = (sum + num) % p;
        }

        int sumToBeRemoved = sum % p;
        if (sumToBeRemoved == 0) {
            return 0;
        }

        unordered_map<int, int> map;
        map[0] = -1;

        int currSum = 0;
        int res = nums.size();
        for (int i = 0; i < nums.size(); i++) {
            currSum = (currSum + nums[i]) % p;
            int prefix = (currSum - sumToBeRemoved + p) % p;

            if (map.find(prefix) != map.end()) {
                res = min(res, i - map[prefix]);
            }

            map[currSum] = i;
        }

        return res == nums.size() ? -1 : res;
    }
};