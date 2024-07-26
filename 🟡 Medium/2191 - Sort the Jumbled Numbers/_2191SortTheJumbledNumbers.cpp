class Solution {
public:
    int digitMapping(vector<int>& mapping, int num) {
        int ans = 0;
        int i = 0;

        if (num == 0) {
            return mapping[num];
        } 

        while (num > 0) {
            int rem = num % 10;
            ans = ans + mapping[rem] * (int)pow(10, i++);
            num /= 10;
        }

        return ans;
    }

    vector<int> sortJumbled(vector<int>& mapping, vector<int>& nums) {
        vector<int> newNums;
        for (int num : nums) {
            newNums.push_back(digitMapping(mapping, num));
        }

        vector<int> numsIndices(nums.size());
        for (int i = 0; i < numsIndices.size(); i++) {
            numsIndices[i] = i;
        }

        sort(numsIndices.begin(), numsIndices.end(),
             [&newNums](int n1, int n2) { return newNums[n1] < newNums[n2]; });

        vector<int> res(nums.size());
        for (int i = 0; i < nums.size(); i++) {
            res[i] = nums[numsIndices[i]];
        }

        return res;
    }
};