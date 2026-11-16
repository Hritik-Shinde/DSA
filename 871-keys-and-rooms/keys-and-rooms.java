class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true;
        queue.offer(0);

        while(!queue.isEmpty()){
          int curr = queue.poll();
          for(int next:rooms.get(curr)){
            if(!visited[next]){
                visited[next] = true;
                queue.offer(next);
            }
          }
        }

        for(boolean vis: visited){
            if(vis == false){
                return false;
            }
        }
        return true;
    }
    
}