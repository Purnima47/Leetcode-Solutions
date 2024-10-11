class Solution {
public:
    int minAddToMakeValid(string s) {
        stack<char> stack;

        for (int i = 0; i < s.size(); i++) {
            if (!stack.empty() && stack.top() == '(' && s.at(i) == ')') {
                stack.pop();
            } else {
                stack.push(s.at(i));
            }
        }

        return stack.size();
    }
};