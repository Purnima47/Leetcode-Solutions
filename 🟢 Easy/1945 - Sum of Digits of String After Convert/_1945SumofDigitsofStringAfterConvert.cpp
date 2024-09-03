class Solution {
public:
    string transform(string str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            ans += str.at(i) - '0';
        }
        return to_string(ans);
    }

    int getLucky(string s, int k) {
        string convertedVal = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.at(i);
            int n = (ch - 'a') + 1;
            convertedVal = convertedVal + to_string(n);
        }

        while (k > 0) {
            convertedVal = transform(convertedVal);
            k--;
        }

        return stoi(convertedVal);
    }
};