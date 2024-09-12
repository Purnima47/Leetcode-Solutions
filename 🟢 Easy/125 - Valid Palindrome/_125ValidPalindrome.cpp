class Solution {
public:
    bool isPalindrome(string s) {
        for (auto& ch : s) {
            ch = tolower(ch);
        }
        
        string sb = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.at(i);
            if (ch >= 48 && ch <= 57) {
                sb += (char)ch;
            }
            if (ch >= 97 && ch <= 122) {
                sb += (char)ch;
            }
        }

        string rev = sb;
        reverse(rev.begin(), rev.end());

        if (sb == rev) {
            return true;
        }

        return false;
    }
};