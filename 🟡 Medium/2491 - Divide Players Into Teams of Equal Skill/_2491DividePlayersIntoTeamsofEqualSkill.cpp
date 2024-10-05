class Solution {
public:
    long long dividePlayers(vector<int>& skill) {
        sort(skill.begin(), skill.end());

        int l = 0, r = skill.size() - 1;
        int start = skill[l] + skill[r];
        long long res = 0;

        while (l < r) {
            if (skill[l] + skill[r] != start) {
                return -1;
            }

            res += (skill[l] * skill[r]);
            l++;
            r--;
        }

        return res;
    }
};