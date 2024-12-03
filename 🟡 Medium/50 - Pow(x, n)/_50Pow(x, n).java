class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        boolean flag = false;
        long power = n;

        if (n < 0) {
            x = 1 / x;
            power = Math.abs(power);
        }

        while (power > 0) {
            // LSB = 1 (Then multiply your answer with x)
            if ((power & 1) != 0) {
                ans *= x;
            }

            x *= x;
            power = power >> 1;
        }

        return ans;
    }
}