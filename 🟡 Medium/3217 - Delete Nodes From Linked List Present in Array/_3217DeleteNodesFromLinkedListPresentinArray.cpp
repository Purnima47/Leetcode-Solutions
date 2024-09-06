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
    ListNode* modifiedList(vector<int>& nums, ListNode* head) {
        unordered_set<int> numbers;
        
        for (auto& num : nums) {
            numbers.insert(num);
        }

        if (head == NULL) {
            return NULL;
        }

        // case 1 : delete from begining
        while (head != NULL) {
            if (numbers.contains(head->val)) {
                head = head->next;
            } else {
                break;
            }
        }

        ListNode* ptr = head;
        // case 2 : delete from end and in between.
        while (ptr->next != NULL) {
            if (numbers.contains(ptr->next->val)) {
                ptr->next = ptr->next->next;
            } else {
                ptr = ptr->next;
            }
        }

        return head;
    }
};