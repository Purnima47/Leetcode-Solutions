class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int div = nums[i] / 10;
            if (div == 0) {
                aSum += nums[i];
            } else {
                bSum += nums[i];
            }
        }

        if (aSum != bSum) {
            return true;
        }
        return false;
    }
};