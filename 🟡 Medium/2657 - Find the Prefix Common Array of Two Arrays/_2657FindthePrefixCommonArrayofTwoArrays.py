class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        freq = [0] * (n + 1)
        res = [0] * n

        count = 0

        for i in range(0, n):
            freq[A[i]] += 1
            if freq[A[i]] == 2:
                count += 1

            freq[B[i]] += 1
            if freq[B[i]] == 2:
                count += 1

            res[i] = count

        return res