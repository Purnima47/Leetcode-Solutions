class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        maxi = 0
        currLongestSeq = 0
        res = 0

        for i in range(0, len(nums)):
            if maxi < nums[i]:
                maxi = nums[i]
                currLongestSeq = 0
                res = 0

            if maxi == nums[i]:
                currLongestSeq += 1
            else:
                currLongestSeq = 0

            res = max(res, currLongestSeq)

        return res
