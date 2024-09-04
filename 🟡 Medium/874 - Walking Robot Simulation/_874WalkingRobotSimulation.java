class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        for (int[] obstacle : obstacles) {
            set.add(obstacle[0] + " " + obstacle[1]);
        }

        int maxDist = 0;
        int currDist = 0;
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        for (int command : commands) {
            if (command == -1) {
                currDist = (currDist + 1) % 4;
            } else if (command == -2) {
                currDist = (currDist - 1 + 4) % 4;
            } else {
                for (int i = 1; i <= command; i++) {
                    if (!set.contains((x + directions[currDist][0]) + " " + (y + directions[currDist][1]))) {
                        x += directions[currDist][0];
                        y += directions[currDist][1];
                    } else {
                        break;
                    }
                }
                maxDist = Math.max(maxDist, x * x + y * y);
            }
        }

        return maxDist;

    }
}