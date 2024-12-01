/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function (height) {
    let n = height.length;

    // LEFT MAX Boundary
    let left = Array(n);
    left[0] = height[0];
    for (let i = 1; i < n; i++) {
        left[i] = Math.max(left[i - 1], height[i]);
    }

    // Right Max Boundary
    let right = Array(n);
    right[n - 1] = height[n - 1];
    for (let i = n - 2; i >= 0; i--) {
        right[i] = Math.max(height[i], right[i + 1]);
    }

    let ans = 0;
    for (let i = 0; i < n; i++) {
        ans += Math.min(right[i], left[i]) - height[i];
    }

    return ans;
};