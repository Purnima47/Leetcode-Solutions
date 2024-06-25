class Solution:
    def minKBitFlips(self, nums: List[int], k: int) -> int:
        n = len(nums)
        w = 0
        count = 0
        flipped = [False] * n

        for i in range(n):
            if i >= k:
                if flipped[i - k]:
                    w -= 1

            if w % 2 == nums[i]:
                if i + k > n:
                    return -1

                w += 1
                flipped[i] = True
                count += 1
        return count
