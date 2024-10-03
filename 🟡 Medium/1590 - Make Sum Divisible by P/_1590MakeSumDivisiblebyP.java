class Solution {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;

        for (int num : nums) {
            sum = (sum + num) % p;
        }

        int sumToBeRemoved = sum % p;
        if (sumToBeRemoved == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int currSum = 0;
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            currSum = (currSum + nums[i]) % p;
            int prefix = (currSum - sumToBeRemoved + p) % p;

            if (map.containsKey(prefix)) {
                res = Math.min(res, i - map.get(prefix));
            }

            map.put(currSum, i);
        }

        return res == nums.length ? -1 : res;
    }
}