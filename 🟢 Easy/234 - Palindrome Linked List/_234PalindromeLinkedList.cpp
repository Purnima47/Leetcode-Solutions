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
    ListNode* midNode(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;

        while (fast != NULL && fast->next != NULL) {
            slow = slow->next;      // +1
            fast = fast->next->next; // +2
        }

        return slow; // our mid node
    }
    bool isPalindrome(ListNode* head) {
        if (head == NULL || head->next == NULL) {
            return true;
        }

        ListNode* prev = NULL;
        ListNode* cur = midNode(head);
        ListNode* next = NULL;

        while (cur != NULL) {
            next = cur->next;
            cur->next = prev;
            prev = cur;
            cur = next;
        }

        ListNode* left = head;
        ListNode* right = prev;

        while (right != NULL) {
            if (left->val != right->val) {
                return false;
            }

            right = right->next;
            left = left->next;
        }

        return true;
    }
};