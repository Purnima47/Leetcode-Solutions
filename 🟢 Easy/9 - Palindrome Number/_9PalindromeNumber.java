

class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int rev = 0;
        while (x > 0) {
            int r = x % 10;
            rev = rev * 10 + r;
            x = x / 10;
        }
        if (num == rev)
            return true;
        return false;
    }
}
