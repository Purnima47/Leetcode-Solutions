class Solution {
public:
    string largestNumber(vector<int>& nums) {
        vector<string> list;
        for (auto& num : nums) {
            list.push_back(to_string(num));
        }

        auto comp = [](string& s1, string& s2) { return s1 + s2 > s2 + s1; };
        sort(list.begin(), list.end(), comp);

        if (list[0] == "0") {
            return "0";
        }

        string res = "";
        for (auto& str : list) {
            res += str;
        }

        return res;
    }
};