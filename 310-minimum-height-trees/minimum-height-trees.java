class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 1){
            return Collections.singletonList(0);
        }

        List<List<Integer>> graph = new ArrayList<>();

        for(int i =0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[n];

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
            inDegree[u]++;
            inDegree[v]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i =0;i<n;i++){
            if(inDegree[i] == 1)
                queue.offer(i);
        }

        int remaningNode = n;
        while(remaningNode > 2){
            int size = queue.size();
            remaningNode -= size;

            for(int i =0;i<size;i++){
                int curr = queue.poll();
                for(int neighbor : graph.get(curr)){
                    inDegree[neighbor]--;
                    if(inDegree[neighbor] == 1){
                        queue.offer(neighbor);
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            result.add(queue.poll());
        }

        return result;

    }
}