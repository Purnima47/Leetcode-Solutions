class Solution {
public:
    int robotSim(vector<int>& commands, vector<vector<int>>& obstacles) {
        int x = 0;
        int y = 0;
        unordered_set<string> set;
        for (auto& obstacle : obstacles) {
            string xObs = to_string(obstacle[0]);
            string yObs = to_string(obstacle[1]);
            set.insert(xObs + " " + yObs);
        }

        int maxDist = 0;
        int currDist = 0;
        vector<vector<int>> directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for (int command : commands) {
            if (command == -1) {
                currDist = (currDist + 1) % 4;
            } else if (command == -2) {
                currDist = (currDist - 1 + 4) % 4;
            } else {
                for (int i = 1; i <= command; i++) {

                    if (!set.contains(
                            (to_string(x + directions[currDist][0])) + " " +
                            (to_string(y + directions[currDist][1])))) {

                        x += directions[currDist][0];
                        y += directions[currDist][1];
                    } else {
                        break;
                    }
                }
                maxDist = max(maxDist, x * x + y * y);
            }
        }

        return maxDist;
    }
};