/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* reverseOddLevels(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        bool level = false;

        while (!q.empty()) {
            int size = q.size();

            if (level) {
                vector<TreeNode*> nodes(size);
                int left = 0, right = size - 1;

                for (int i = 0; i < size; i++) {
                    nodes[i] = q.front();
                    q.pop();
                    q.push(nodes[i]);
                }

                while (left < right) {
                    int temp = nodes[left]->val;
                    nodes[left]->val = nodes[right]->val;
                    nodes[right]->val = temp;
                    left++;
                    right--;
                }
            }

            for (int i = 0; i < size; i++) {
                TreeNode* node = q.front();
                q.pop();

                if (node->left != NULL) {
                    q.push(node->left);
                }

                if (node->right != NULL) {
                    q.push(node->right);
                }
            }
            level = !level;
        }

        return root;
    }
};