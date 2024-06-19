class Solution {
public:
    int romanToInt(string s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.at(i);

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

                if ((s.at(i) == 'I' && s.at(i + 1) == 'V') ||
                    (s.at(i) == 'I' && s.at(i + 1) == 'X') ||
                    (s.at(i) == 'I' && s.at(i + 1) == 'L') ||
                    (s.at(i) == 'I' && s.at(i + 1) == 'C') ||
                    (s.at(i) == 'I' && s.at(i + 1) == 'D') ||
                    (s.at(i) == 'I' && s.at(i + 1) == 'M')) {
                    sum -= 2;
                }

                if ((s.at(i) == 'V' && s.at(i + 1) == 'X') ||
                    (s.at(i) == 'V' && s.at(i + 1) == 'L') ||
                    (s.at(i) == 'V' && s.at(i + 1) == 'C') ||
                    (s.at(i) == 'V' && s.at(i + 1) == 'D') ||
                    (s.at(i) == 'V' && s.at(i + 1) == 'M')) {
                    sum -= 10;
                }

                if ((s.at(i) == 'X' && s.at(i + 1) == 'L') ||
                    (s.at(i) == 'X' && s.at(i + 1) == 'C') ||
                    (s.at(i) == 'X' && s.at(i + 1) == 'D') ||
                    (s.at(i) == 'X' && s.at(i + 1) == 'M')) {
                    sum -= 20;
                }

                if ((s.at(i) == 'L' && s.at(i + 1) == 'C') ||
                    (s.at(i) == 'L' && s.at(i + 1) == 'D') ||
                    (s.at(i) == 'L' && s.at(i + 1) == 'M')) {
                    sum -= 100;
                }

                if ((s.at(i) == 'C' && s.at(i + 1) == 'D') ||
                    (s.at(i) == 'C' && s.at(i + 1) == 'M')) {
                    sum -= 200;
                }
            }
        }
        return sum;
    }
};