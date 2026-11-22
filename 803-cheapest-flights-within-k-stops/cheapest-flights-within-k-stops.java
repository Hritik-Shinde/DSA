
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build directed weighted graph
        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int price = flight[2];

            graph.get(u).add(new int[]{v, price});
        }

        // Minimum cost to reach each node using a given edge count
        int[][] dist = new int[n][k + 2];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        // {cost, node, edgesUsed}
        pq.offer(new int[]{0, src, 0});
        dist[src][0] = 0;

        while (!pq.isEmpty()) {

            int[] curr = pq.poll();

            int cost = curr[0];
            int node = curr[1];
            int edgesUsed = curr[2];

            if (node == dst) {
                return cost;
            }

            if (cost > dist[node][edgesUsed]) {
                continue;
            }

            if (edgesUsed == k + 1) {
                continue;
            }

            for (int[] neighbor : graph.get(node)) {

                int nextNode = neighbor[0];
                int price = neighbor[1];

                int newCost = cost + price;
                int nextEdges = edgesUsed + 1;

                if (newCost < dist[nextNode][nextEdges]) {
                    dist[nextNode][nextEdges] = newCost;

                    pq.offer(new int[]{
                        newCost, nextNode, nextEdges
                    });
                }
            }
        }

        return -1;
    }
}
