class Solution {
public:
    vector<string> removeAnagrams(vector<string>& words) {
        vector<string> res;
        string prev = "";

        for (int i = 0; i < words.size(); i++) {
            string curr = words[i];
            sort(curr.begin(), curr.end());

            if (curr != prev) {
                res.push_back(words[i]);
            }

            prev = curr;
        }

        return res;
    }
};