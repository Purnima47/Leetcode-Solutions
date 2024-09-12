/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var midNode = function (head) {
    let slow = head;
    let fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next; // +1
        fast = fast.next.next; // +2 
    }

    return slow; // our mid node
}

var isPalindrome = function (head) {
    if (head == null || head.next == null) {
        return true;
    }

    let prev = null;
    let cur = midNode(head);
    let next = null;

    while (cur != null) {
        next = cur.next;
        cur.next = prev;
        prev = cur;
        cur = next;
    }

    let left = head;
    let right = prev;

    while (right != null) {
        if (left.val != right.val) {
            return false;
        }

        right = right.next;
        left = left.next;
    }

    return true;
};