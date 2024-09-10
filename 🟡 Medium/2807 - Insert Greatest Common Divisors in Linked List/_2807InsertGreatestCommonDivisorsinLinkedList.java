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
    public int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;

        while (ptr1.next != null) {
            int cd = gcd(ptr1.val, ptr2.val);
            ListNode temp = new ListNode(cd);
            ptr1.next = temp;
            temp.next = ptr2;
            ptr1 = ptr2;
            ptr2 = ptr2.next;
        }

        return head;
    }
}