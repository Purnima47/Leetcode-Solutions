class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        words = sentence.split(" ")
        length = len(words)

        prev = words[length - 1][-1]

        for i in range(length):
            if words[i][0] != prev:
                return False
            prev = words[i][-1]

        return True