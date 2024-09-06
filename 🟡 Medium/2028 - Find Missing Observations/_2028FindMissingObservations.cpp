class Solution {
public:
    vector<int> missingRolls(vector<int>& rolls, int mean, int n) {
        int sumOfm = 0;
        for (auto& roll : rolls) {
            sumOfm += roll;
        }
        int sumOfn = mean * (n + rolls.size()) - sumOfm;

        if (sumOfn > n * 6 || sumOfn < n) {
            return {};
        }

        vector<int> res(n);
        if (sumOfn % n == 0 && sumOfn <= n * 6) {
            fill(res.begin(), res.end(), sumOfn / n);
            return res;
        }

        int i = 0;
        while (sumOfn > 0) {
            int num = sumOfn / n;
            res[i++] = num;
            sumOfn -= num;
            n--;
        }

        return res;
    }
};