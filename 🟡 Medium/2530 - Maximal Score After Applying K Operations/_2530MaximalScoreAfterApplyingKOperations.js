/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maxKelements = function (nums, k) {
    let pq = new MaxPriorityQueue();
    for (let num of nums) {
        pq.enqueue(num);
    }

    let res = 0;

    while (k > 0) {
        let maxi = pq.dequeue().element;
        res += maxi;
        pq.enqueue(Math.ceil(maxi / 3));
        k--;
    }

    return res;

};