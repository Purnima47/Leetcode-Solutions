class Solution {
    public String transform(String str) {
        int ans = 0;
        for (char digit : str.toCharArray()) {
            ans += digit - '0';
        }
        return String.valueOf(ans);
    }

    public int getLucky(String s, int k) {
        String convertedVal = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int n = (ch - 'a') + 1;
            convertedVal = convertedVal + String.valueOf(n);
        }

        while (k > 0) {
            convertedVal = transform(convertedVal);
            k--;
        }

        return Integer.parseInt(convertedVal);
    }
}