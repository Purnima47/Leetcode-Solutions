class Solution {
public:
    int lessThanEqualTok(vector<int>& nums, int k) {
        int sum = 0, count = 0, l = 0, r = 0;
        while (r < nums.size()) {
            sum += nums[r] % 2;
            while (sum > k) {
                sum -= nums[l] % 2;
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
    
    int numberOfSubarrays(vector<int>& nums, int k) {
        return lessThanEqualTok(nums, k) - lessThanEqualTok(nums, k - 1);
    }
};