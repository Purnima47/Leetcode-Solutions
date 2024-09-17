class Solution:
    def countWords(self, words1: List[str], words2: List[str]) -> int:
        map1 = {}
        map2 = {}
        count = 0

        for str in words1:
            if str in map1:
                map1[str] += 1
            else:
                map1[str] = 1

        for str in words2:
            if str in map2:
                map2[str] += 1
            else:
                map2[str] = 1

        for str in words1:
            if map1[str] == 1:
                if str in map2:
                    if map2[str] == 1:
                        count += 1

        return count
