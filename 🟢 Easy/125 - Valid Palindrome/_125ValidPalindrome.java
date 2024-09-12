class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57) {
                sb.append(ch);
            }
            if (ch >= 97 && ch <= 122) {
                sb.append(ch);
            }

        }
        String fstr = sb.toString();
        String rev = sb.reverse().toString();
        if (fstr.equals(rev)) {
            return true;
        }
        return false;
    }
}