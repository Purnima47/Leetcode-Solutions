class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        val = nums[0]

        for i in range(1, len(nums)):
            if val == nums[i]:
                return True
            else:
                val = nums[i]

        return False
