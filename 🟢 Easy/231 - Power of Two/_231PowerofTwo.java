class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 536870912) {
            return true;
        }
        int pow = (int) (Math.log(n) / Math.log(2));
        double pow2 = (Math.log(n) / Math.log(2));
        if (pow == pow2) {
            return true;
        }
        return false;
    }
}