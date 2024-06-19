class Solution {
public:
    int ans(vector<string>& words, vector<int>& score, vector<int>& freq,
            int i) {
        if (i == words.size()) {
            return 0;
        }

        int notInclude = ans(words, score, freq, i + 1);
        int wordScore = 0;
        int include = 0;
        bool flag = true;
        string word = words[i];
        for (auto& ch : word) {
            if (freq[ch - 'a'] <= 0) {
                flag = false;
            }
            freq[ch - 'a']--;
            wordScore += score[ch - 'a'];
        }

        if (flag) {
            include = wordScore + ans(words, score, freq, i + 1);
        }

        for (auto& ch : word) {
            freq[ch - 'a']++;
        }

        return max(include, notInclude);
    }

    int maxScoreWords(vector<string>& words, vector<char>& letters,
                      vector<int>& score) {
        vector<int> freq(26);
        for (const char& letter : letters) {
            freq[letter - 'a']++;
        }

        return ans(words, score, freq, 0);
    }
};