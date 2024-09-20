class Solution:
    def shortestPalindrome(self, s: str) -> str:
        rev = s[::-1]

        for i in range(0, len(s)):
            if s[: len(s) - i] == rev[i:]:
                return rev[:i] + s

        return ""
