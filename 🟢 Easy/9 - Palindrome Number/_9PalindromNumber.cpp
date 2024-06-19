class Solution {
public:
    bool isPalindrome(int x) {
        long num = x;
        long rev = 0;
        while (x > 0) {
            int r = x % 10;
            rev = rev * 10 + r;
            x = x / 10;
        }

        return num == rev;
    }
};