class Solution {
public:
    int findTheWinner(int n, int k) {
        vector<int> friends;

        for (int i = 1; i <= n; i++) {
            friends.push_back(i);
        } 

        int start = 0;
        int size = friends.size();
        while (size > 1) {
            int removeIdx = (start + k - 1) % size;
            friends.erase(friends.begin() + removeIdx);
            start = removeIdx;
            size = friends.size();
        }

        return friends[0];
    }
};