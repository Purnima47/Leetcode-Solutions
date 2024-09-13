class Solution {
public:
    bool isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        vector<int> primeFactors = {2, 3, 5};
        for (auto& prime : primeFactors) {
            while (n % prime == 0) {
                n /= prime;
            }
        }

        // if 1 occurs then it is "UGLY NUMBER".
        return n == 1;
    }
};