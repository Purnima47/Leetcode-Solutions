class Solution:
    def minimumSteps(self, s: str) -> int:
        res = 0
        whitePos = 0

        for zero in range(0, len(s)):
            if s[zero] == "0":
                res += zero - whitePos
                whitePos += 1

            zero -= 1

        return res
