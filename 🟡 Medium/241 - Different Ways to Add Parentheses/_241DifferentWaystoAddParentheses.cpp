class Solution {
public:
    vector<int> diffWaysToCompute(string expression) {
        vector<int> res;

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression[i];

            if (isdigit(ch)) {
                continue;
            }

            vector<int> left, right;
            left = diffWaysToCompute(expression.substr(0, i));
            right = diffWaysToCompute(expression.substr(i + 1));

            for (auto& j : left) {
                for (auto& k : right) {
                    if (ch == '+') {
                        res.push_back(j + k);
                    } else if (ch == '-') {
                        res.push_back(j - k);
                    } else {
                        res.push_back(j * k);
                    }
                }
            }
        }

        if (res.empty()) {
            res.push_back(stoi(expression));
        }

        return res;
    }
};