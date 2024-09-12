class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<Boolean> containList = new ArrayList<>(Collections.nCopies(26, false));
        int count = 0;
        
        for (int i = 0; i < allowed.length(); i++) {
            containList.set((allowed.charAt(i) - 'a'), true);
        }

        boolean notAllowed = false;
        
        for (String word : words) {
            notAllowed = false;

            for (int i = 0; i < word.length(); i++) {
                if (containList.get(word.charAt(i) - 'a') == false) {
                    notAllowed = true;
                    break;
                }
            }

            if (!notAllowed) {
                count++;
            }
        }

        return count;

    }
}