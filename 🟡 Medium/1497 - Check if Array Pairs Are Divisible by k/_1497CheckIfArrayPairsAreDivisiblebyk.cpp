class Solution {
public:
    bool canArrange(vector<int>& arr, int k) {
        vector<int> freq(k);

        for (auto& el : arr) {
            int modulo = ((el % k) + k) % k;
            freq[modulo] += 1;
        }

        if (freq[0] % 2 != 0) {
            return false;
        }

        for (int i = 1; i <= k / 2; i++) {

            if (freq[i] != freq[k - i]) {
                return false;
            }
        }

        return true;
    }
};