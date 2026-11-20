class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] dislike:dislikes){
            int u = dislike[0];
            int v = dislike[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] color = new int[n+1];
        for(int i =1;i<=n;i++){
            if(color[i] != 0){
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            color[i] = 1;
            while(!queue.isEmpty()){
                int curr = queue.poll();
                for(int next:graph.get(curr)){
                    if(color[next] == 0){
                        color[next] = -color[curr];
                        queue.offer(next);
                    }
                    else if(color[next] == color[curr]){
                        return false;
                    }
                }
            }
        }

        return true;
        
    }
}