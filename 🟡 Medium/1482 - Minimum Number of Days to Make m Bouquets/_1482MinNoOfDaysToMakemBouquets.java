class Solution {
    public boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int bouquets = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {
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

    public int minDays(int[] bloomDay, int m, int k) {
        int minmDays = 0;
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
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
}