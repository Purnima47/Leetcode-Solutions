bool isUgly(int n) {
    if (n <= 0) {
        return false;
    }

    int primeFactors[] = {2, 3, 5};
    for (int i = 0; i < 3; i++) {
        while (n % primeFactors[i] == 0) {
            n /= primeFactors[i];
        }
    }

    // if 1 occurs then it is "UGLY NUMBER".
    return n == 1;
}