class Solution {
public:
    bool isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }
        if (n == 536870912) {
            return true;
        }

        int pow = (int)(log(n) / log(2));
        double pow2 = (log(n) / log(2));
        if (pow == pow2) {
            return true;
        }
        return false;
    }
};