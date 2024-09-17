class Solution {
public:
    int countWords(vector<string>& words1, vector<string>& words2) {
        unordered_map<string, int> map1;
        unordered_map<string, int> map2;
        int count = 0;

        for (auto& str : words1) {
            if (map1.find(str) != map1.end()) {
                map1[str]++;
            } else {
                map1[str] = 1;
            }
        }

        for (auto& str : words2) {
            if (map2.find(str) != map2.end()) {
                map2[str]++;
            } else {
                map2[str] = 1;
            }
        }

        for (auto& str : words1) {
            if (map1[str] == 1 && map2.find(str) != map2.end()) {
                if (map2[str] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
};