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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        if (head == null) {
            return null;
        }

        // case 1 : delete from begining
        while (head != null) {
            if (numbers.contains(head.val)) {
                head = head.next;
            } else {
                break;
            }
        }

        ListNode ptr = head;
        // case 2 : delete from end and in between.
        while (ptr.next != null) {
            if (numbers.contains(ptr.next.val)) {
                ptr.next = ptr.next.next;
            } else {
                ptr = ptr.next;
            }
        }

        return head;
    }
}