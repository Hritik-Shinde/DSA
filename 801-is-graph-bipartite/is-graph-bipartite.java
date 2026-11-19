class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color,-1);
        for(int i =0;i<n;i++){
            if(color[i] != -1){
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            color[i] = 0;
            while(!queue.isEmpty()){
                int curr = queue.poll();
                for(int neibour: graph[curr]){
                    if(color[neibour] ==-1){
                    color[neibour] = 1- color[curr];
                    queue.offer(neibour);
                    }
                    else if(color[neibour]  == color[curr]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}