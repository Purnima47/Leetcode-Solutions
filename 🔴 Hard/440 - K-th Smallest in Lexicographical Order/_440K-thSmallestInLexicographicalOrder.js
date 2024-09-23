/**
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
var countSteps = function (n, pref1, pref2) {
    let count = 0;
    while (pref1 <= n) {
        count += Math.min(n + 1, pref2) - pref1;
        pref1 *= 10;
        pref2 *= 10;
    }
    return count;
}

var findKthNumber = function (n, k) {
    let res = 1;
    k--;

    while (k > 0) {
        let count = countSteps(n, res, res + 1);
        if (count <= k) {
            res++;
            k -= count;
        } else {
            res *= 10;
            k--;
        }
    }

    return res;
};