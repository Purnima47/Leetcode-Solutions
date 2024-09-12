class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        vector<bool> contains(26);
        int count = 0;

        for (int i = 0; i < allowed.length(); i++) {
            contains[allowed.at(i) - 'a'] = true;
        }

        bool notAllowed = false;

        for (auto& word : words) {
            notAllowed = false;

            for (int i = 0; i < word.length(); i++) {
                if (contains[word.at(i) - 'a'] == false) {
                    notAllowed = true;
                    break;
                }
            }

            if (!notAllowed) {
                count++;
            }
        }

        return count;
    }
};