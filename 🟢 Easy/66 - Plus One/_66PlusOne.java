class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if (digits[n - 1] != 9) {
            int ld = digits[n - 1];
            digits[n - 1] = ld + 1;
            return digits;
        } else if (digits[n - 1] == 9 && n == 1) {
            int arr[] = new int[n + 1];
            arr[0] = 1;
            arr[1] = 0;
            return arr;
        } else if (digits[n - 1] == 9 && digits[n - 2] != 9) {
            digits[n - 1] = 0;
            digits[n - 2] = digits[n - 2] + 1;
            return digits;
        } else {
            int i = n - 1;
            while (digits[i] == 9 && i > 0) {
                digits[i] = 0;
                i--;
            }
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                int arr[] = new int[n + 1];
                arr[0] = 1;
                for (int j = 1; j < arr.length; j++) {
                    arr[j] = 0;
                }
                return arr;
            }
        }
    }
}