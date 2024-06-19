class Solution {
public:
    bool isPossible(vector<int>& bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.size(); i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                bouquets += count / k;
                count = 0;
            }
        }
        bouquets += count / k;
        return bouquets >= m;
    }

    int minDays(vector<int>& bloomDay, int m, int k) {
        int minmDays = 0;
        if ((long)m * k > bloomDay.size()) {
            return -1;
        }

        int low = INT_MAX;
        int high = INT_MIN;

        for (int day : bloomDay) {
            low = min(low, day);
            high = max(high, day);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {
                minmDays = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return minmDays;
    }
};