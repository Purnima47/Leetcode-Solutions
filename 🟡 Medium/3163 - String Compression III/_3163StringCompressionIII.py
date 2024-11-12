class Solution:
    def compressedString(self, word: str) -> str:
        res = ""
        i = 0
        curr = word[0]

        while i < len(word):
            count = 0

            while i < len(word) and word[i] == curr and count < 9:
                i += 1
                count += 1

            res += str(count) + curr

            if i != len(word):
                curr = word[i]

        return res
