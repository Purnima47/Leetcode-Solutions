class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        num1 = set(nums1)
        num2 = set(nums2)
        res = []

        for n in num1:
            if n in num2:
                res.append(n)

        return res