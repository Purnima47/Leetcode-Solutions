class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if (n == 1 || n == 2) {
            return false;
        }
        int i = 0;
        int j = 1;
        int k = 2;
        if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[k] % 2 != 0) {
            return true;
        }
        while (!(arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[k] % 2 != 0) && (i < n - 3) && (j < n - 2) && (k < n - 1)) {
            i++;
            j++;
            k++;
            if (arr[i] % 2 != 0 && arr[j] % 2 != 0 && arr[k] % 2 != 0) {
                return true;
            }
        }
        
        return false;
    }
}
