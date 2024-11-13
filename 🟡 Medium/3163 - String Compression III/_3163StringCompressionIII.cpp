class Solution {
public:
    string compressedString(string word) {
        string res = "";
        int i = 0;
        
        char curr = word[0];

        while (i < word.size()) {
            int count = 0;

            while (i < word.size() && word[i] == curr && count < 9) {
                i++;
                count++;
            }

            res += to_string(count) + curr;

            if (i != word.size()) {
                curr = word[i];
            }
        }

        return res;
    }
};