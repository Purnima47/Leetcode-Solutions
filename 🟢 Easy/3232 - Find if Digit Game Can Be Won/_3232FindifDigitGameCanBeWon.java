class Solution {
    public boolean canAliceWin(int[] nums) {
        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int div = nums[i] / 10;
            if (div == 0) {
                aSum += nums[i];
            } else {
                bSum += nums[i];
            }
        }

        if (aSum != bSum) {
            return true;
        }
        return false;
    }
}