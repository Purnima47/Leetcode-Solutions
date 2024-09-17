class Solution {
public:
    vector<string> uncommonFromSentences(string s1, string s2) {
        vector<string> res;
        string s = s1 + " " + s2;
        unordered_map<string, int> map;
        string curr = "";
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == ' ') {
                if (map.find(curr) == map.end()) {
                    map[curr] = 1;
                } else {
                    map[curr]++;
                }
                curr = "";
            } else {
                curr += s[i];
            }
        }

        if (map.find(curr) != map.end()) {
            map[curr]++;
        } else {
            map[curr] = 1;
        }

        for (auto& it : map) {
            if (it.second == 1) {
                res.push_back(it.first);
            }
        }

        return res;
    }
};