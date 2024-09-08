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
    vector<ListNode*> splitListToParts(ListNode* head, int k) {
        vector<ListNode*> res(k);
        ListNode* ptr = head;
        int count = 0;
        while (ptr != NULL) {
            count++;
            ptr = ptr->next;
        }

        ptr = head;
        int split = count / k;
        int remains = count % k;

        for (int i = 0; i < k; i++) {
            ListNode dummy(0);
            ListNode* hd = &dummy;
            int currentSize = split;
            if (remains > 0) {
                remains--;
                currentSize++;
            }
            int j = 0;
            while (j < currentSize) {
                hd->next = new ListNode(ptr->val);
                hd = hd->next;
                j++;
                ptr = ptr->next;
            }
            res[i] = dummy.next;
        }

        return res;
    }
};