/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> spiralMatrix(int m, int n, ListNode* head) {
        vector<vector<int>> res(m, vector<int>(n, -1));
        int tR = 0, bR = m - 1, lC = 0, rC = n - 1;
        // CW Direction -> top row --> right column --> bottom row --> left
        // column
        while (head != NULL) {
            int column = lC;
            while (column <= rC && head != NULL) {
                res[tR][column] = head->val;
                column++;
                head = head->next;
            }
            tR++;

            int row = tR;
            while (row <= bR && head != NULL) {
                res[row][rC] = head->val;
                row++;
                head = head->next;
            }
            rC--;

            column = rC;
            while (column >= lC && head != NULL) {
                res[bR][column] = head->val;
                column--;
                head = head->next;
            }
            bR--;

            row = bR;
            while (row >= tR && head != NULL) {
                res[row][lC] = head->val;
                row--;
                head = head->next;
            }
            lC++;
        }

        return res;
    }
};