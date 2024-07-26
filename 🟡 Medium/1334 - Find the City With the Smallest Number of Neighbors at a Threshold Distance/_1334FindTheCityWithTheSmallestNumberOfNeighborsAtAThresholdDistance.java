class Solution {
    public void flyodWarshall(int n, int[][] dist) {

        // when src and dest is same node then its weight is 0.
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }

        // Applying flyodWarshall logic
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] == Integer.MAX_VALUE || dist[k][j] == Integer.MAX_VALUE) {
                        continue;
                    }
                    // if there exists smallest distance than previous one then it would be
                    // replaced.
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
    }

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Initialize all distances will infinity.
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int[] edge : edges) {
            int src = edge[0];
            int dest = edge[1];
            int weight = edge[2];

            // for undirected graph, weight will same from src --> dest and dest --> src.
            dist[src][dest] = weight;
            dist[dest][src] = weight;
        }

        flyodWarshall(n, dist);

        int countCity = n;
        int cityNo = -1;

        for (int city = 0; city < n; city++) {
            int count = 0;
            for (int adjCity = 0; adjCity < n; adjCity++) {
                if (city == adjCity) {
                    continue;
                }

                if (dist[city][adjCity] <= distanceThreshold) {
                    count++;
                }
            }

            if (count <= countCity) {
                countCity = count;
                cityNo = city;
            }
        }

        return cityNo;
    }

}
