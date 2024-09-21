class Solution {
    public void dfs(int i, int n, List<Integer> res) {
        if (i > n) {
            return;
        }

        res.add(i);

        for (int j = 0; j < 10; j++) {
            dfs(10 * i + j, n, res);
        }
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(i, n, res);
        }

        return res;
    }
}