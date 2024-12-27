/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean level = false;

        while (!q.isEmpty()) {
            int size = q.size();

            if (level) {
                TreeNode[] nodes = new TreeNode[size];
                int left = 0, right = size - 1;

                for (int i = 0; i < size; i++) {
                    nodes[i] = q.poll();
                    q.offer(nodes[i]);
                }

                while (left < right) {
                    int temp = nodes[left].val;
                    nodes[left].val = nodes[right].val;
                    nodes[right].val = temp;
                    left++;
                    right--;
                }
            }

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }

            }
            level = !level;
        }

        return root;
    }
}