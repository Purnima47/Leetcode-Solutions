/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */

let gcd = function (x, y) {
    while (y != 0) {
        let temp = y;
        y = x % y;
        x = temp;
    }
    return x;
}

var insertGreatestCommonDivisors = function (head) {
    if (head == null || head.next == null) {
        return head;
    }
        let ptr1 = head;
        let ptr2 = head.next;

    while (ptr1.next != null) {
        let cd = gcd(ptr1.val, ptr2.val);
        let temp = new ListNode(cd);
        ptr1.next = temp;
        temp.next = ptr2;
        ptr1 = ptr2;
        ptr2 = ptr2.next;
    }

    return head;
};