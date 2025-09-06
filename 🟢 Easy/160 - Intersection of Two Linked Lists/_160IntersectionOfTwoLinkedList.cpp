class Solution {
public:
    ListNode* getIntersectionNode(ListNode* headA, ListNode* headB) {
        int lenA = 0;
        ListNode* tempA = headA;
        while (tempA != NULL) {
            lenA++;
            tempA = tempA->next;
        }

        int lenB = 0;
        ListNode* tempB = headB;
        while (tempB != NULL) {
            lenB++;
            tempB = tempB->next;
        }

        int diff = abs(lenA - lenB);

        tempA = headA;
        tempB = headB;
        if (lenA > lenB) {
            for (int i = 0; i < diff; i++) {
                tempA = tempA->next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                tempB = tempB->next;
            }
        }

        while (tempA != NULL && tempB != NULL) {
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA->next;
            tempB = tempB->next;
        }

        return NULL;
    }
};