class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        stack = []

        for i in range(0, len(s)):
            if len(stack) != 0 and stack[-1] == "(" and s[i] == ")":
                stack.pop()
            else:
                stack.append(s[i])

        return len(stack)
