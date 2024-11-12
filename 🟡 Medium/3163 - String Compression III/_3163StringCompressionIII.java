class Solution {
    public String compressedString(String word) {
        StringBuilder res = new StringBuilder("");
        int i = 0;
        char curr = word.charAt(0);

        while (i < word.length()) {
            int count = 0;

            while (i < word.length() && word.charAt(i) == curr && count < 9) {
                i++;
                count++;
            }

            res.append(count).append(curr);

            if (i != word.length()) {
                curr = word.charAt(i);
            }
        }

        return res.toString();
    }
}