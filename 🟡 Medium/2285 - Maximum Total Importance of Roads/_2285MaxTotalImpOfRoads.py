class Solution:
    def maximumImportance(self, n: int, roads: List[List[int]]) -> int:
        freq = [0] * n

        for edge in roads:
            freq[edge[0]] += 1
            freq[edge[1]] += 1

        freq.sort()

        imp = 0
        k = 1

        for f in freq:
            imp += k * f
            k += 1

        return imp
