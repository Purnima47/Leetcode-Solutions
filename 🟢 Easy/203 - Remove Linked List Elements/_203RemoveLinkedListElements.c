/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    if (head == NULL) {
        return NULL;
    }

    // case 1 : delete from begining
    while (head != NULL) {
        if (head->val == val) {
            if (head->next == NULL) {
                return NULL;
            }
            head = head->next;
        } else {
            break;
        }
    }

    struct ListNode* ptr = head;
    // case 2 : delete from end and in between.
    while (ptr->next != NULL) {
        if (ptr->next->val == val) {
            ptr->next = ptr->next->next;
        } else {
            ptr = ptr->next;
        }
    }

    return head;
}