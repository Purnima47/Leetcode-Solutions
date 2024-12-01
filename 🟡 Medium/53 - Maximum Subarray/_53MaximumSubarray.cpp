class Solution {
    public:
        int maxSubArray(vector<int>& nums) {
            // KADANE'S ALGO
    
            int cs = 0;
            int maxSum = INT_MIN;
    
            for (auto& num : nums) {
                cs += num;
                maxSum = max(maxSum, cs);
    
                if (cs < 0) {
                    cs = 0;
                }
            }
    
            return maxSum;
        }
    };