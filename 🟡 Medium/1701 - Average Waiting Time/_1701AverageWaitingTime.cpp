class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
        double ans = 0;
        int n = customers.size();
        int arrivalTime = 0;

        for (int i = 0; i < n; i++) {
            arrivalTime = max(customers[i][0], arrivalTime) + customers[i][1];
            ans += arrivalTime - customers[i][0];
        }

        return ans / n;
    }
};