class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        int count = 0;
        if (s.charAt(l - 1) != ' ') {
            if (l == 1)
                return 1;
            while (l > 0) {
                if (s.charAt(l - 1) == ' ')
                    break;
                count++;
                l--;
            }

            return count;
        } else {
            while (s.charAt(l - 1) == ' ') {
                l--;
            }
            if (l == 1)
                return 1;
            while (l > 0) {
                if (s.charAt(l - 1) == ' ')
                    break;
                l--;
                count++;
            }
            
            return count;
        }
    }
}
