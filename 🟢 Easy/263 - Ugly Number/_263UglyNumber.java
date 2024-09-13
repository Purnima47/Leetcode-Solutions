class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        int[] primeFactors = { 2, 3, 5 };
        for (int prime : primeFactors) {
            while (n % prime == 0) {
                n /= prime;
            }
        }

        // if 1 occurs then it is "UGLY NUMBER".
        return n == 1;
    }
}