class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int res[] = new int[n];
        int sumOfm = 0;
        for (int roll : rolls) {
            sumOfm += roll;
        }
        int sumOfn = mean * (n + rolls.length) - sumOfm;
        System.out.println(sumOfn);

        if (sumOfn > n * 6 || sumOfn < n) {
            return new int[0];
        }

        if (sumOfn % n == 0 && sumOfn <= n * 6) {
            Arrays.fill(res, sumOfn / n);
            return res;
        }

        int i = 0;
        while (sumOfn > 0) {
            int num = sumOfn / n;
            res[i++] = num;
            sumOfn -= num;
            n--;
        }

        return res;

    }
}