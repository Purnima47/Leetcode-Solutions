class Solution {
    public int longestSubarray(int[] nums) {
        int maxi = 0;
        int currMax = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (maxi < nums[i]) {
                maxi = nums[i];
                currMax = 0;
                res = 0;
            }

            if (maxi == nums[i]) {
                currMax++;
            } else {
                currMax = 0;
            }

            res = Math.max(res, currMax);
        }
        return res;
    }
}