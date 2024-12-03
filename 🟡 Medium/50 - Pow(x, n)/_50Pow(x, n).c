long absolute(long power) {
    if (power < 0) {
        return power * (-1);
    }else{
        return power;
    }
}

double myPow(double x, int n) {
    double ans = 1.0;
    long power = n;

    if (n < 0) {
        x = 1 / x;
        power = absolute(power);
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