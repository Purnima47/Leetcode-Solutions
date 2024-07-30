class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int[] ACountArr = new int[n];
        int[] BCountArr = new int[n];
        int noOfA = 0;
        int noOfB = 0;
        int minDel = n;

        for (int i = 0; i < n; i++) {
            BCountArr[i] = noOfB;
            if (s.charAt(i) == 'b') {
                noOfB++;
            }

            ACountArr[n - i - 1] = noOfA;
            if (s.charAt(n - i - 1) == 'a') {
                noOfA++;
            }
        }

        for (int i = 0; i < n; i++) {
            minDel = Math.min(minDel, ACountArr[i] + BCountArr[i]);
        }

        return minDel;
    }
}
