class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> num2 = new HashSet<>();

        for (int n1 : nums1) {
            num1.add(n1);
        }

        for (int n2 : nums2) {
            if (num1.contains(n2)) {
                num2.add(n2);
            }
        }

        int[] res = new int[num2.size()];
        int k = 0;

        for (int n : num2) {
            res[k++] = n;
        }

        return res;
    }
}