/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
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

        ListNode ptr = head;
        // case 2 : delete from end and in between.
        while (ptr.next != null) {
            if (ptr.next.val == val) {
                ptr.next = ptr.next.next;
            } else {
                ptr = ptr.next;
            }
        }

        return head;
    }
}