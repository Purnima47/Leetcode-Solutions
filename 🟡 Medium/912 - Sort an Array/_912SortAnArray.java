class Solution {
    public void divide(int[] nums, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(nums, si, mid);
        divide(nums, mid + 1, ei);
        conquer(nums, si, mid, ei);
    }

    public void conquer(int[] nums, int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int x = 0;

        while (i <= mid && j <= ei) {
            if (nums[i] < nums[j]) {
                temp[x++] = nums[i++];
            } else {
                temp[x++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[x++] = nums[i++];
        }

        while (j <= ei) {
            temp[x++] = nums[j++];
        }

        for (int l = 0, m = si; l < temp.length; l++, m++) {
            nums[m] = temp[l];
        }
    }

    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }
}