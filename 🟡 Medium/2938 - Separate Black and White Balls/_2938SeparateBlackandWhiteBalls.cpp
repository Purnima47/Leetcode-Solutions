class Solution {
public:
    long long minimumSteps(string s) {
        long long res = 0;
        int zero = 0;
        int whitePos = 0;

        while (zero < s.length()) {
            if (s[zero] == '0') {
                res += (zero - whitePos);
                whitePos++;
            }

            zero++;
        }

        return res;
    }
};