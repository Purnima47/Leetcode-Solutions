class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        String vowels = "AEIOUaeiou";

        char[] word = s.toCharArray();

        while (i < j) {
            while (i < j && vowels.indexOf(word[i]) == -1) {
                i++;
            }

            while (i < j && vowels.indexOf(word[j]) == -1) {
                j--;
            }

            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;

            i++;
            j--;
        }

        return String.valueOf(word);
    }
}