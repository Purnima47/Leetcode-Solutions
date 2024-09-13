class Solution {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else {
                nums[j++] = nums[i];
            }
        }

        for (int i = 0; i < countZero; i++) {
            nums[j++] = 0;
        }
    }
}