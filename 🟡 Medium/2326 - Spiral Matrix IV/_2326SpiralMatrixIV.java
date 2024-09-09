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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int res[][] = new int[m][n];
        for (int[] row : res) {
            Arrays.fill(row, -1);
        }

        int tR = 0, bR = m - 1, lC = 0, rC = n - 1;
        // CW Direction -> top row --> right column --> bottom row --> left column
        while (head != null) {
            int column = lC;
            while (column <= rC && head != null) {
                res[tR][column] = head.val;
                column++;
                head = head.next;
            }
            tR++;

            int row = tR;
            while (row <= bR && head != null) {
                res[row][rC] = head.val;
                row++;
                head = head.next;
            }
            rC--;

            column = rC;
            while (column >= lC && head != null) {
                res[bR][column] = head.val;
                column--;
                head = head.next;
            }
            bR--;

            row = bR;
            while (row >= tR && head != null) {
                res[row][lC] = head.val;
                row--;
                head = head.next;
            }
            lC++;
        }

        return res;
    }
}