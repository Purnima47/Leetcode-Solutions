class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        aSum = 0
        bSum = 0
        for i in range(0, len(nums)):
            div = nums[i] // 10
            if div == 0:
                aSum += nums[i]
            else:
                bSum += nums[i]

        if aSum != bSum:
            return True

        return False
