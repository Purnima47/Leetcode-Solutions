class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int w = 0;
        int count = 0;
        boolean[] flipped = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                if (flipped[i - k]) {
                    w--;
                }
            }
            if (w % 2 == nums[i]) {
                if (i + k > n) {
                    return -1;
                }

                w++;
                flipped[i] = true;
                count++;
            }
        }

        return count;
    }
}