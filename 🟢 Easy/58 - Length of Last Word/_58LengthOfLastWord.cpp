class Solution {
public:
    int lengthOfLastWord(string s) {
        int l = s.length();
        int count = 0;
        if (s.at(l - 1) != ' ') {
            if (l == 1)
                return 1;
            while (l > 0) {
                if (s.at(l - 1) == ' ')
                    break;
                count++;
                l--;
            }
            
            return count;
        } else {
            while (s.at(l - 1) == ' ') {
                l--;
            }
            if (l == 1)
                return 1;
            while (l > 0) {
                if (s.at(l - 1) == ' ')
                    break;
                l--;
                count++;
            }

            return count;
        }
    }
};