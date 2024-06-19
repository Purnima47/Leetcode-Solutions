

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;

                default:
                    break;
            }
            if (i < s.length() - 1) {

                if ((s.charAt(i) == 'I' && s.charAt(i + 1) == 'V')
                        || (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X')
                        || (s.charAt(i) == 'I' && s.charAt(i + 1) == 'L')
                        || (s.charAt(i) == 'I' && s.charAt(i + 1) == 'C')
                        || (s.charAt(i) == 'I' && s.charAt(i + 1) == 'D')
                        || (s.charAt(i) == 'I' && s.charAt(i + 1) == 'M')) {
                    sum -= 2;
                }

                if ((s.charAt(i) == 'V' && s.charAt(i + 1) == 'X')
                        || (s.charAt(i) == 'V' && s.charAt(i + 1) == 'L')
                        || (s.charAt(i) == 'V' && s.charAt(i + 1) == 'C')
                        || (s.charAt(i) == 'V' && s.charAt(i + 1) == 'D')
                        || (s.charAt(i) == 'V' && s.charAt(i + 1) == 'M')) {
                    sum -= 10;
                }

                if ((s.charAt(i) == 'X' && s.charAt(i + 1) == 'L')
                        || (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C')
                        || (s.charAt(i) == 'X' && s.charAt(i + 1) == 'D')
                        || (s.charAt(i) == 'X' && s.charAt(i + 1) == 'M')) {
                    sum -= 20;
                }

                if ((s.charAt(i) == 'L' && s.charAt(i + 1) == 'C')
                        || (s.charAt(i) == 'L' && s.charAt(i + 1) == 'D')
                        || (s.charAt(i) == 'L' && s.charAt(i + 1) == 'M')) {
                    sum -= 100;
                }

                if ((s.charAt(i) == 'C' && s.charAt(i + 1) == 'D')
                        || (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M')) {
                    sum -= 200;
                }
            }
        }
        return sum;
    }
}
