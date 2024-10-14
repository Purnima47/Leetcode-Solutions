class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            pq.offer(num);
        }

        long res = 0;
        while (k > 0) {
            int maxi = pq.poll();
            res += maxi;
            pq.add((maxi + 2) / 3);
            k--;
        }

        return res;

    }
}