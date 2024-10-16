class Solution:
    def longestDiverseString(self, a: int, b: int, c: int) -> str:
        currA = 0
        currB = 0
        currC = 0
        maxLen = a + b + c
        i = 0
        sb = ""
        for i in range(0, maxLen):
            if currA != 2 and a >= b and a >= c or a > 0 and (currB == 2 or currC == 2):
                sb += "a"
                currA += 1
                currB = 0
                currC = 0
                a -= 1

            elif (
                currB != 2 and b >= a and b >= c or b > 0 and (currA == 2 or currC == 2)
            ):
                sb += "b"
                currB += 1
                currA = 0
                currC = 0
                b -= 1

            elif (
                currC != 2 and c >= a and c >= b or c > 0 and (currA == 2 or currB == 2)
            ):
                sb += "c"
                currC += 1
                currA = 0
                currB = 0
                c -= 1

        return sb
