import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (val == nums[i]) {
                return true;
            } else {
                val = nums[i];
            }
        }
        return false;

    }
}