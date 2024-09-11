/**
 * @param {number} start
 * @param {number} goal
 * @return {number}
 */
var minBitFlips = function (start, goal) {
    let cnt = 0;

    while (start > 0 || goal > 0) {
        if ((start & 1) != (goal & 1)) {
            cnt++;
        }
        start >>= 1;
        goal >>= 1;
    }
    return cnt;
};