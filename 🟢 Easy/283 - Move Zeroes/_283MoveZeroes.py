class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        countZero = 0
        j = 0
        for i in range(0, len(nums)):
            if nums[i] == 0:
                countZero += 1
            else:
                nums[j] = nums[i]
                j += 1

        for i in range(0, countZero):
            nums[j] = 0
            j += 1
