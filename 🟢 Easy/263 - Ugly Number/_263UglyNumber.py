class Solution:
    def isUgly(self, n: int) -> bool:
        if n <= 0:
            return False

        primeFactors = [2, 3, 5]

        for i in range(0, 3):
            while n % primeFactors[i] == 0:
                n /= primeFactors[i]

        return n == 1
