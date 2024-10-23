class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(nums[j]) && (j - map.get(nums[j]) <= k)) {
                return true;
            }

            map.put(nums[j], j);
        }
        return false;
    }
}