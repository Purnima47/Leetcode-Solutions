class Solution {
    public long minimumSteps(String s) {
        int zero = s.length() - 1;
        int one = s.length() - 1;

        StringBuilder sb = new StringBuilder(s);

        while (one >= 0 && sb.charAt(one) == '1') {
            one--;
            zero--;
        }

        long steps = 0;

        while (one >= 0) {
            while (one >= 0 && sb.charAt(one) != '1') {
                one--;
            }

            while (zero >= 0 && sb.charAt(zero) != '0') {
                zero--;
            }

            if (zero == -1 || one == -1) {
                break;
            }

            steps += zero - one;

            sb.setCharAt(one, '0');
            sb.setCharAt(zero, '1');
        }

        return steps;

    }
}