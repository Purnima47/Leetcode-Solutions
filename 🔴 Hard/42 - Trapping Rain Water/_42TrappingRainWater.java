class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // LEFT MAX Boundary
        int left[] = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }

        // Right Max Boundary
        int right[] = new int[n];
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(right[i], left[i]) - height[i];
        }

        return ans;
    }
}