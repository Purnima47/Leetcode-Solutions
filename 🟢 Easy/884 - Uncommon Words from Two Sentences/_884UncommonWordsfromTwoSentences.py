class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        s = s1 + " " + s2
        arr = list(s.split(" "))
        map = {}

        for str in arr:
            if str in map:
                map[str] += 1
            else:
                map[str] = 1

        res = []

        for key in map:
            if map[key] == 1:
                res.append(key)

        return res
