class Solution {
public:
    long long maxKelements(vector<int>& nums, int k) {
        priority_queue<int> pq;
        for (auto& num : nums) {
            pq.push(num);
        }

        long long res = 0;
        while (k > 0) {
            int maxi = pq.top();
            res += maxi;
            pq.pop();
            pq.push((maxi + 2) / 3);
            k--;
        }

        return res;
    }
};