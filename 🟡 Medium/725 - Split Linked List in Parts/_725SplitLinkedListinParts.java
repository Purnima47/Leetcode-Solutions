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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode res[] = new ListNode[k];
        ListNode ptr = head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }

        ptr = head;
        int split = count / k;
        int remains = count % k;

        for (int i = 0; i < k; i++) {
            ListNode dummy = new ListNode(0);
            ListNode hd = dummy;
            int currentSize = split;
            if (remains > 0) {
                remains--;
                currentSize++;
            }
            int j = 0;
            while (j < currentSize) {
                hd.next = new ListNode(ptr.val);
                hd = hd.next;
                j++;
                ptr = ptr.next;
            }
            res[i] = dummy.next;
        }

        return res;
    }
}