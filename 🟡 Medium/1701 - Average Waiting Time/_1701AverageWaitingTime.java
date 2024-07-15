class Solution {
    public double averageWaitingTime(int[][] customers) {
        double ans = 0;
        int n = customers.length;
        int arrivalTime = 0;

        for (int i = 0; i < n; i++) {
            arrivalTime = Math.max(customers[i][0], arrivalTime) + customers[i][1];
            ans += arrivalTime - customers[i][0];
        }

        return ans / n;
    }
}