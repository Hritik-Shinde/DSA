class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph,path,0,result);
        return result;
    }

    private void dfs(int[][] graph,List<Integer> path,int node,List<List<Integer>> result){
        if(node == graph.length-1){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int next: graph[node]){
         path.add(next);
        dfs(graph,path,next,result);
        path.remove(path.size()-1);
        }
    }
}