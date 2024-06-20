class Solution {
    public boolean canPlaceBalls(int[] position, int m, int maxDist) {
        
        int count = 1;
        int prevBall = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - prevBall >= maxDist) {
                prevBall = position[i];
                count++;
            }

            if (count >= m) {
                return true;
            }
        }

        return false;
    }

    public int maxDistance(int[] position, int m) {

        int maxDist = 0;
        Arrays.sort(position);

        int low = 1;
        int high = position[position.length - 1];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceBalls(position, m, mid)) {
                maxDist = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return maxDist;
    }
}