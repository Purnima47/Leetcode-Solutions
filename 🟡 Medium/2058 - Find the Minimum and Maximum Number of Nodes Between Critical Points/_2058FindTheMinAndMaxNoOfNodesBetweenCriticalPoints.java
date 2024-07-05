class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;

        // ptr1 will point towards first node of list and then will point to second node and so on.
        ListNode ptr1 = head;

        // ptr2 will point towards second node of list and then will point to third node and so on.
        ListNode ptr2 = head.next;

        // ptr3 will point towards third node of list and then will point to fourth node and so on.
        ListNode ptr3 = head.next.next;

        // this is used to track index of list.
        int i = 1;

        // To add index of critical points.
        ArrayList<Integer> idx = new ArrayList<>();

        // this would traverse through whole list.
        while (ptr3 != null) {

            // We will apply the condition of critical point i.e. local maxima or local minima.
            if (ptr2.val > ptr1.val && ptr2.val > ptr3.val || ptr2.val < ptr1.val && ptr2.val < ptr3.val) {

                // If condition is true then we will add those node's index to our list.
                idx.add(i);
            }

            // Update the values of ptr1, ptr2, ptr3 and i.
            ptr1 = ptr2;
            ptr2 = ptr3;

            if (ptr3 != null) {
                ptr3 = ptr3.next;
            }

            i++;
        }

        // If there are fewer than two critical points then return [-1, -1].
        if (idx.size() < 2) {
            return arr;
        }

        // Find minDist from idx and place it to arr[0].
        int minDist = idx.get(idx.size() - 1) - idx.get(idx.size() - 2);
        int idxI1 = 0;
        int idxI2 = 1;

        while (idxI2 < idx.size()) {
            minDist = Math.min(minDist, idx.get(idxI2) - idx.get(idxI1));
            idxI1++;
            idxI2++;
        }

        arr[0] = minDist;

        // Find maxDist from idx and place it to arr[1].
        // maxDist will be maxIndex - minIndex.
        arr[1] = idx.get(idx.size() - 1) - idx.get(0);

        // return your result.
        return arr;
    }
}
