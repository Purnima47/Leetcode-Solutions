class Solution {
public:
    vector<int> arrayRankTransform(vector<int>& arr) {
        set<int> arrSet(arr.begin(), arr.end());

        unordered_map<int, int> map;
        int r = 1;
        for (auto& el : arrSet) {
            map.insert({el, r});
            r++;
        }

        for (int i = 0; i < arr.size(); i++) {
            arr[i] = map[arr[i]];
        }

        return arr;
    }
};