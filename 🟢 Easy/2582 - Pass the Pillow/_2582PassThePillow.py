class Solution:
    def passThePillow(self, n: int, time: int) -> int:
        div = time // (n - 1)
        rem = time % (n - 1)

        if div % 2 == 0:
            return rem + 1

        return n - rem
