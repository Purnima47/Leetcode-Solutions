class Solution:
    def minSubarray(self, nums: List[int], p: int) -> int:
        total_sum = sum(nums)
        sum_to_remove = total_sum % p

        if sum_to_remove == 0:
            return 0

        idx_map = {0: -1}
        curr_sum = 0
        res = len(nums)

        for i, num in enumerate(nums):
            curr_sum = (curr_sum + num) % p
            prefix = (curr_sum - sum_to_remove + p) % p

            if prefix in idx_map:
                res = min(res, i - idx_map[prefix])

            idx_map[curr_sum] = i

        if res == len(nums):
            return -1
        else:
            return res
