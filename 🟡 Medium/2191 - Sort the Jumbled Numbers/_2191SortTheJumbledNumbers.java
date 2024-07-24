class Solution {
    public int digitMapping(int[] mapping, int num) {
        int ans = 0;
        int i = 0;

        if (num == 0) {
            return mapping[num];
        }
        
        while (num > 0) {
            int rem = num % 10;
            ans = ans + mapping[rem] * (int) Math.pow(10, i++);
            num /= 10;
        }

        return ans;

    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<Integer> newNums = new ArrayList<>();
        for (int num : nums) {
            newNums.add(digitMapping(mapping, num));
        }

        Integer[] numsIndices = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsIndices[i] = i;
        }

        Arrays.sort(numsIndices, (n1, n2) -> newNums.get(n1) - newNums.get(n2));

        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[numsIndices[i]];
        }

        return res;
    }

}