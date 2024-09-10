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
    int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        if (head == NULL || head->next == NULL) {
            return head;
        }
        ListNode* ptr1 = head;
        ListNode* ptr2 = head->next;

        while (ptr1->next != NULL) {
            int cd = gcd(ptr1->val, ptr2->val);
            ListNode* temp = new ListNode(cd);
            ptr1->next = temp;
            temp->next = ptr2;
            ptr1 = ptr2;
            ptr2 = ptr2->next;
        }

        return head;
    }
};