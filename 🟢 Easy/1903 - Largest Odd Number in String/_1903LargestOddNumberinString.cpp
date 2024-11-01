class Solution {
public:
    string largestOddNumber(string num) {
        int i = num.length() - 1;
        int to = 0;
        while (i >= 0) {
            if ((num.at(i) - '0') % 2 != 0) {
                to = i + 1;
                break;
            }
            i--;
        }

        return num.substr(0, to);
    }
};