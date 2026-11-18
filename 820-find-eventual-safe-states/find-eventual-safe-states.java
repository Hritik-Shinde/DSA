class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }

        int[] inDegree = new int[graph.length];

        for(int i =0;i<graph.length;i++){
            for(int it : graph[i]){
                adj.get(it).add(i);
                inDegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> safeNode = new ArrayList<>();

        for(int i =0;i<graph.length;i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int curr = queue.poll();
            safeNode.add(curr);

            for(int next : adj.get(curr)){
                inDegree[next]--;
                if(inDegree[next] == 0){
                    queue.offer(next);
                }
            }
        }

        Collections.sort(safeNode);
        return safeNode;
    }
}