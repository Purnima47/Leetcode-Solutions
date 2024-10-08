class Solution {
    public String sortString(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }

    public boolean checkInclusion(String s1, String s2) {
        String str1 = sortString(s1);
        int len1 = s1.length();
        int len2 = s2.length();

        for (int i = 0; i <= len2 - len1; i++) {
            if (str1.equals(sortString(s2.substring(i, i + len1))))
                return true;
        }
        return false;
    }
}