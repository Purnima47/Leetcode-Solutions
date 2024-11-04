class Solution:
    def makeFancyString(self, s: str) -> str:
        prev = s[0]
        count = 1
        res = s[0]

        for i in range(1, len(s)):
            if s[i] == prev:
                count += 1
            else:
                count = 1
                prev = s[i]

            if count < 3:
                res += s[i]

        return res
