class Solution {
    public void dfs(int node, List<List<Integer>> adjList, Set<Integer> visitedSet) {
        visitedSet.add(node);

        for (int dest : adjList.get(node)) {
            if (!visitedSet.contains(dest)) {
                dfs(dest, adjList, visitedSet);
            }
        }
    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {

        List<List<Integer>> adjList = new ArrayList<>();
        List<List<Integer>> ancesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int source = edge[0];
            int destination = edge[1];

            adjList.get(destination).add(source);
        }

        for (int i = 0; i < n; i++) {
            List<Integer> ancestors = new ArrayList<>();
            Set<Integer> visitedSet = new HashSet<>();
            dfs(i, adjList, visitedSet);

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                if (visitedSet.contains(j)) {
                    ancestors.add(j);
                }
            }

            ancesList.add(ancestors);
        }
        return ancesList;
    }
}