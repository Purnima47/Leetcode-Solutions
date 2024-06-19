class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int nums[] = new int[n1 + n2];
        int k = 0;

        int i = 0;
        while (i < n1) {
            nums[k++] = nums1[i++];
        }

        int j = 0;
        while (j < n2) {
            nums[k++] = nums2[j++];
        }

        Arrays.sort(nums);

        int mid = (n1 + n2) / 2;
        if ((n1 + n2) % 2 == 0) {
            return ((double) nums[mid] + (double) nums[mid - 1]) / 2.0;
        } else {
            return (double) nums[mid];
        }
    }
}