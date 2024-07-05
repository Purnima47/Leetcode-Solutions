class Solution {
    public ListNode mergeNodes(ListNode head) {
        // lp -> left pointer which would point at first zero
        ListNode lp = head;

        // rp -> right pointer first would be mark at head next then we will
        // find its appropriate position
        ListNode rp = head.next;

        // this res node will store our final answer
        ListNode res = new ListNode(-1);

        // this is its head
        ListNode resultHead = res;

        // We will run the loop till it reaches last node
        while (rp != null) {

            // We will find our rp appropriate position i.e. next zero other then first one.
            while (rp.val != 0) {
                rp = rp.next;
            }

            // We will store sum of values between lp and rp
            int sum = 0;
            while (lp != rp) {
                sum += lp.val;
                lp = lp.next;
            }

            // now we will link our sum to resultHead.
            resultHead.next = new ListNode(sum);
            resultHead = resultHead.next;

            // We have to repeat the process till all sum values are not added to result node.

            // lp will now point to rp
            lp = rp;
            // and rp to its next iff its next value is not null.
            if (rp != null) {
                rp = rp.next;
            }
        }

        // now return your list.
        return res.next;

    }
}