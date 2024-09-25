class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int res = 0;

        Set<Integer> prefixesOfarr1 = new HashSet<>();

        for (int el : arr1) {
            while (!prefixesOfarr1.contains(el) && el > 0) {
                prefixesOfarr1.add(el);
                el /= 10;
            }
        }

        for (int el : arr2) {
            while (!prefixesOfarr1.contains(el) && el > 0) {
                el /= 10;
            }

            if (el > 0) {
                res = Math.max(res, (int) Math.floor(Math.log10(el) + 1));
            }
        }

        return res;
    }
}