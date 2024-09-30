class Solution:
    def longestCommonPrefix(self, arr1: List[int], arr2: List[int]) -> int:
        res = 0

        prefixesOfarr1 = set()

        for el in arr1:
            while el not in prefixesOfarr1 and el > 0:
                prefixesOfarr1.add(el)
                el //= 10

        for el in arr2:
            while el not in prefixesOfarr1 and el > 0:
                el //= 10

            if el > 0:
                res = max(res, (int)(log10(el) + 1))

        return res
