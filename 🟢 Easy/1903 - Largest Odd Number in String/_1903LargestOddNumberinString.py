class Solution:
    def largestOddNumber(self, num: str) -> str:
        i = len(num) - 1
        to = 0
        while i >= 0:
            if (int(num[i]) % 2) != 0:
                to = i + 1
                break

            i -= 1

        return num[0:to]