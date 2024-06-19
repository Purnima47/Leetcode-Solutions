class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode newList = new ListNode();
        ListNode head = newList;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int i = (temp1 != null) ? temp1.val : 0;
            int j = (temp2 != null) ? temp2.val : 0;
            int sum = i + j + carry;
            head.next = new ListNode(sum % 10);
            carry = sum / 10;
            head = head.next;

            if (temp1 != null) {
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                temp2 = temp2.next;
            }
        }

        if (carry != 0) {
            head.next = new ListNode(carry);
        }

        return newList.next;
    }
}