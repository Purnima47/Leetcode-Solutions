class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        setArr = sorted(set(arr))

        mapForRank = {}
        r = 1

        for el in setArr:
            mapForRank[el] = r
            r += 1

        for i in range(0, len(arr)):
            arr[i] = mapForRank[arr[i]]

        return arr
