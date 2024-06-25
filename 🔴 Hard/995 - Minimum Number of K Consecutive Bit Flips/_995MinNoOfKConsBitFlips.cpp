class Solution {
public:
    int minKBitFlips(vector<int>& nums, int k) {
        int n = nums.size();
        int w = 0;
        int count = 0;
        vector<bool> flipped(n);

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                if (flipped[i - k]) {
                    w--;
                }
            }
            if (w % 2 == nums[i]) {
                if (i + k > n) {
                    return -1;
                }

                w++;
                flipped[i] = true;
                count++;
            }
        }

        return count;
    }
};