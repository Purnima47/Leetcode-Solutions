public class _7ReverseInteger {
    class Solution {
        public int reverse(int x) {
            long rev = 0;
            int n = Math.abs(x);
            while (n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }

            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }

            return  x > 0 ? (int) rev : -(int) rev;
        }
    }
}
