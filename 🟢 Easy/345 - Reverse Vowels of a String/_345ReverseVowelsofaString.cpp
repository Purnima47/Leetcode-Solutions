class Solution {
public:
    string reverseVowels(string s) {
        int i = 0;
        int j = s.length() - 1;
        string vowels = "AEIOUaeiou";

        while (i < j) {
            while (i < j && vowels.find(s[i]) == -1) {
                i++;
            }

            while (i < j && vowels.find(s[j]) == -1) {
                j--;
            }

            swap(s[i], s[j]);

            i++;
            j--;
        }

        return s;
    }
};