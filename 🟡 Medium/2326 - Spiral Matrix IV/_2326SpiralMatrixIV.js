/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {number} m
 * @param {number} n
 * @param {ListNode} head
 * @return {number[][]}
 */

var spiralMatrix = function (m, n, head) {
    const res = new Array(m).fill().map(() => new Array(n).fill(-1));
    let tR = 0, bR = m - 1, lC = 0, rC = n - 1;
    // CW Direction -> top row --> right column --> bottom row --> left column
    while (head != null) {
        let column = lC;
        while (column <= rC && head != null) {
            res[tR][column] = head.val;
            column++;
            head = head.next;
        }
        tR++;

        let row = tR;
        while (row <= bR && head != null) {
            res[row][rC] = head.val;
            row++;
            head = head.next;
        }
        rC--;

        column = rC;
        while (column >= lC && head != null) {
            res[bR][column] = head.val;
            column--;
            head = head.next;
        }
        bR--;

        row = bR;
        while (row >= tR && head != null) {
            res[row][lC] = head.val;
            row--;
            head = head.next;
        }
        lC++;
    }

    return res;
};