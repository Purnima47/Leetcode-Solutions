class Solution {
    public int ans(String words[], int score[], int freq[], int i) {
        if (i == words.length) {
            return 0;
        }

        int notInclude = ans(words, score, freq, i + 1);
        int wordScore = 0;
        int include = 0;
        boolean flag = true;
        String word = words[i];
        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);
            if (freq[ch - 'a'] <= 0) {
                flag = false;
            }
            freq[ch - 'a']--;
            wordScore += score[ch - 'a'];
        }

        if (flag) {
            include = wordScore + ans(words, score, freq, i + 1);
        }

        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j);
            freq[ch - 'a']++;
        }

        return Math.max(include, notInclude);
    }

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int freq[] = new int[26];
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            freq[ch - 'a']++;
        }
        return ans(words, score, freq, 0);
    }
}