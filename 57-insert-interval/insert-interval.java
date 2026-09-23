class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        for(int i =0;i<intervals.length;i++){
            int[] interval = intervals[i];
            //before

            if(interval[1]< newInterval[0]){
                result.add(interval);
            }

            else if(interval[0]> newInterval[1]){
                result.add(newInterval);

                for(int j =i;j<intervals.length;j++){
                    result.add(intervals[j]);
                }

                return result.toArray(new int[result.size()][]);
            }
            else{
                newInterval[0] = Math.min(newInterval[0],interval[0]);
                newInterval[1] = Math.max(newInterval[1],interval[1]); 
            }
        }
        result.add(newInterval);
         return result.toArray(new int[result.size()][]);
    }
}