/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function (head, val) {
    if (head == null) {
        return null;
    }

    // case 1 : delete from begining
    while (head != null) {
        if (head.val == val) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
        } else {
            break;
        }
    }

    let ptr = head;
    // case 2 : delete from end and in between.
    while (ptr.next != null) {
        if (ptr.next.val == val) {
            ptr.next = ptr.next.next;
        } else {
            ptr = ptr.next;
        }
    }

    return head;
};