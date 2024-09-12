class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0 && i >= 0) {
            if (nums1[i] < nums2[j]) {
                int temp = nums2[j];
                nums2[j] = nums1[k];
                nums1[k] = temp;
                j--;
            } else {
                int temp = nums1[i];
                nums1[i] = nums1[k];
                nums1[k] = temp;
                i--;
            }
            k--;
        }

        while (j >= 0) {
            int temp = nums2[j];
            nums2[j] = nums1[k];
            nums1[k] = temp;
            j--;
            k--;
        }

        while (i >= 0) {
            int temp = nums1[i];
            nums1[i] = nums1[k];
            nums1[k] = temp;
            i--;
            k--;
        }
    }
};