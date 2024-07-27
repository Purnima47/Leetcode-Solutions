class Solution {
    public void flyodWarshall(int n, long[][] minCost) {

        for (int i = 0; i < n; i++) {
            minCost[i][i] = 0;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    minCost[i][j] = Math.min(minCost[i][j], minCost[i][k] + minCost[k][j]);
                }
            }
        }
    }

    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long ans = 0;
        int n = 26;
        long[][] minCost = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                minCost[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < original.length; i++) {
            
            int originalCharIdx = original[i] - 'a';
            int changedCharIdx = changed[i] - 'a';

            minCost[originalCharIdx][changedCharIdx] = Math.min
            (minCost[originalCharIdx][changedCharIdx],
                    (long) cost[i]);
        }

        flyodWarshall(n, minCost);

        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target.charAt(i)) {
                continue;
            }

            int sourceCharIdx = source.charAt(i) - 'a';
            int targetCharIdx = target.charAt(i) - 'a';

            if (minCost[sourceCharIdx][targetCharIdx] >= Integer.MAX_VALUE) {
                return -1;
            }

            ans += minCost[sourceCharIdx][targetCharIdx];

        }

        return ans;
    }
}
