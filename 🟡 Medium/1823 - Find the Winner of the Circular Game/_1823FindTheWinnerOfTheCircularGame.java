class Solution {
    public int findTheWinner(int n, int k) {
        // To store friends which are in the game (circular manner)
        List<Integer> friends = new ArrayList<>();

        // at starting all friends are there so add it in list.
        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }

        // start is the index from where game will start after removing friend who has
        // lost the game.
        int start = 0;
        // store size of friends in the game.
        int size = friends.size();

        // loop will run until last player has been left.
        while (size > 1) {
            // Count that index at which we have to remove the friend who just lost.
            // this would be modulo by size because they are sitting in a circle.
            int removeIdx = (start + k - 1) % size;

            // remove that friend from the game.
            friends.remove(removeIdx);

            // and now we have to start from the very next friend..since friend is removed
            // therefore size will decrease and the next starting index would be removeIdx
            // only.
            start = removeIdx;
            // calculate new size.
            size = friends.size();
        }

        // now only one element is left therefore return the winner which is at index 0.
        return friends.get(0);
    }
}