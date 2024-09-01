class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        // 0 < i < words.length
        // words[i - 1] and words[i] are anagrams i.e. anargrams are present
        // consecutively.
        // delete words[i] from words (IMP)

        String prev = "";

        for (int i = 0; i < words.length; i++) {
            char charArr[] = words[i].toCharArray();
            Arrays.sort(charArr);
            // ARRAY --> STRING
            String curr = String.valueOf(charArr);

            if (!curr.equals(prev)) {
                res.add(words[i]);
            }

            prev = curr;
        }

        return res;
    }
}