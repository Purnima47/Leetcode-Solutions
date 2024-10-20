class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        res = []
        i = len(num) - 1
        while i >= 0 or k > 0:
            if i >= 0:
                k += num[i]

            res.append(k % 10)
            k //= 10
            i -= 1

        res.reverse()
        return res
