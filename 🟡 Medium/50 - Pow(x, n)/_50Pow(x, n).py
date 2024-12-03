class Solution:
    def myPow(self, x: float, n: int) -> float:
        ans = 1

        if n < 0:
            x = 1 / x
            n = abs(n)

        while n > 0:
            if (n & 1) == 1:
                ans *= x
            x *= x
            n //= 2

        return ans
