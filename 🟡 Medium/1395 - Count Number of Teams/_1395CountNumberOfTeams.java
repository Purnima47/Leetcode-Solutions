class Solution {
    public int numTeams(int[] rating) {
        int teams = 0;
        
        int n = rating.length;
        int[] left = new int[n];
        int[] right = new int[n];

        for (int i = 1; i < n; i++) {
            int lcount = 0;
            int rcount = 0;

            for (int j = 0; j < i; j++) {
                if (rating[i] > rating[j]) {
                    lcount++;
                } else {
                    rcount++;
                }
            }

            left[i] = lcount;
            right[i] = rcount;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (rating[i] > rating[j]) {
                    teams += left[j];
                } else {
                    teams += right[j];
                }
            }
        }

        return teams;
    }
}