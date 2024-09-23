class Solution {
public:
    int countSteps(int n, long long pref1, long long pref2) {
        int count = 0;
        while (pref1 <= n) {
            count += min((long long)n + 1, pref2) - pref1;
            pref1 *= 10;
            pref2 *= 10;
        }
        return count;
    }

    int findKthNumber(int n, int k) {
        int res = 1;
        k--;

        while (k > 0) {
            int count = countSteps(n, (long long)res, (long long)res + 1);
            if (count <= k) {
                res++;
                k -= count;
            } else {
                res *= 10;
                k--;
            }
        }

        return res;
    }
};