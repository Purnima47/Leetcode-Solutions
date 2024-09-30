class Solution {
    class Node {
        Node child[] = new Node[26];
        int count = 0;

        public Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
        }
    }

    public Node root = new Node();

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            }
            curr.child[idx].count++;
            curr = curr.child[idx];
        }
    }

    public int count(String word) {
        Node curr = root;
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            ans += curr.child[idx].count;
            curr = curr.child[idx];
        }
        return ans;
    }

    public int[] sumPrefixScores(String[] words) {
        int[] res = new int[words.length];
        for (String word : words) {
            insert(word);
        }

        for (int i = 0; i < words.length; i++) {
            res[i] = count(words[i]);
        }

        return res;
    }
}