class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # KADANE'S ALGORITHM
        cs = 0
        maxSum = min(nums)

        for i in range(0, len(nums)):
            cs += nums[i]
            maxSum = max(maxSum, cs)

            if cs < 0:
                cs = 0

        return maxSum
