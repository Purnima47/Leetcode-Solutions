/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* midNode(struct ListNode* head) {
    struct ListNode* slow = head;
    struct ListNode* fast = head;

    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;       // +1
        fast = fast->next->next; // +2
    }

    return slow; // our mid node
}

bool isPalindrome(struct ListNode* head) {
    if (head == NULL || head->next == NULL) {
        return true;
    }

    struct ListNode* prev = NULL;
    struct ListNode* cur = midNode(head);
    struct ListNode* next = NULL;

    while (cur != NULL) {
        next = cur->next;
        cur->next = prev;
        prev = cur;
        cur = next;
    }

    struct ListNode* left = head;
    struct ListNode* right = prev;

    while (right != NULL) {
        if (left->val != right->val) {
            return false;
        }

        right = right->next;
        left = left->next;
    }

    return true;
}