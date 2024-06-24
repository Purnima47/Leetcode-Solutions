class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> inc = new LinkedList<>();
        Deque<Integer> dec = new LinkedList<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r < nums.length; r++) {
            while (!inc.isEmpty() && inc.getLast() > nums[r]) {
                inc.removeLast();
            }
            while (!dec.isEmpty() && dec.getLast() < nums[r]) {
                dec.removeLast();
            }

            inc.addLast(nums[r]);
            dec.addLast(nums[r]);

            while (dec.getFirst() - inc.getFirst() > limit) {
                if (dec.getFirst() == nums[l]) {
                    dec.removeFirst();
                }
                if (inc.getFirst() == nums[l]) {
                    inc.removeFirst();
                }
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}