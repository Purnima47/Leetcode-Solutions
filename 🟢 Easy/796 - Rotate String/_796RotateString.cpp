class Solution {
public:
    bool rotateString(string s, string goal) {
        if (s.size() != goal.size()) {
            return false;
        }

        string newStr = s + s;

        return newStr.find(goal) != -1;
    }
};