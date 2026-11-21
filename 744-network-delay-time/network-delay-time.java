class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i =0;i<=n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] time : times){
            int u = time[0];
            int v = time[1];
            int w = time[2];

            graph.get(u).add(new int[]{v,w});
        }

        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.offer(new int[]{0,k});

        while(!pq.isEmpty()){
            int[] current = pq.poll();

            int currentDistance = current[0];
            int node = current[1];

            if(currentDistance > dist[node]){
                continue;
            }

            for(int[] neibhour: graph.get(node)){
                int nextNode = neibhour[0];
                int wight = neibhour[1];
                int newDistance = currentDistance+wight;
                if(newDistance < dist[nextNode]){
                    dist[nextNode] = newDistance;
                    pq.offer(new int[]{newDistance,nextNode});
                }
            }
        }

        int maxTime = 0;
        for(int i =1;i<=n;i++){
            if(dist[i] == Integer.MAX_VALUE){
                return -1;
            }
            maxTime = Math.max(maxTime,dist[i]);
        }

        return maxTime;
    }
}