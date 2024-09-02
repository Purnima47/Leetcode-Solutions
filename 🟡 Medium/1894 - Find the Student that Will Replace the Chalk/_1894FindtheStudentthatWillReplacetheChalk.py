class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        chalkSum = 0

        for i in range(len(chalk)):
            chalkSum += chalk[i]

        k %= chalkSum
        for i in range(len(chalk)):
            idx = i
            if chalk[i] > k:
                return i
            else:
                k -= chalk[i]

        return idx
