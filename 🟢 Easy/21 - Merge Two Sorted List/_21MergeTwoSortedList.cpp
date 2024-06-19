class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* newList = new ListNode(0);
        ListNode* head = newList;

        while (list1 != NULL && list2 != NULL) {
            if (list1->val >= list2->val) {
                head->next = list2;
                list2 = list2->next;
            } else {
                head->next = list1;
                list1 = list1->next;
            }

            head = head->next;
        }

        if (list1 != NULL) {
            head->next = list1;
        }

        if (list2 != NULL) {
            head->next = list2;
        }

        return newList->next;
    }
};