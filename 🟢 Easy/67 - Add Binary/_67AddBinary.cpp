class Solution {
public:
    string addBinary(string a, string b) {
        string sum = "";
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) {
                carry += a.at(i) - '0';
                i--;
            }

            if (j >= 0) {
                carry += b.at(j) - '0';
                j--;
            }

            sum.append(to_string(carry % 2));
            carry /= 2;
        }

        reverse(sum.begin(), sum.end());
        return sum;
    }
};