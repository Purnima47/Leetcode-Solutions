class Solution {
    public int maxSubArray(int[] nums) {
        // KADANE'S ALGORITHM

        int cs = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            cs += num;
            maxSum = Math.max(maxSum, cs);

            if (cs < 0) {
                cs = 0;
            }
        }

        return maxSum;
    }
}