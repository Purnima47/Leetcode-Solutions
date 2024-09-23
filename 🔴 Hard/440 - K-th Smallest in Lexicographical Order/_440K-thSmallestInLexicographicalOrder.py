class Solution:
    def countSteps(self, n, pref1, pref2):
        count = 0
        while pref1 <= n:
            count += min(n + 1, pref2) - pref1
            pref1 *= 10
            pref2 *= 10

        return count

    def findKthNumber(self, n: int, k: int) -> int:
        res = 1
        k -= 1

        while k > 0:
            count = self.countSteps(n, res, res + 1)
            if count <= k:
                res += 1
                k -= count
            else:
                res *= 10
                k -= 1

        return res
