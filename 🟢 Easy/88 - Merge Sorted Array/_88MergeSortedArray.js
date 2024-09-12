/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
    let i = m - 1;
    let j = n - 1;
    let k = m + n - 1;

    while (j >= 0 && i >= 0) {
        if (nums1[i] < nums2[j]) {
            let temp = nums2[j];
            nums2[j] = nums1[k];
            nums1[k] = temp;
            j--;
        } else {
            let temp = nums1[i];
            nums1[i] = nums1[k];
            nums1[k] = temp;
            i--;
        }
        k--;
    }

    while (j >= 0) {
        let temp = nums2[j];
        nums2[j] = nums1[k];
        nums1[k] = temp;
        j--;
        k--;
    }

    while (i >= 0) {
        let temp = nums1[i];
        nums1[i] = nums1[k];
        nums1[k] = temp;
        i--;
        k--;
    }
};