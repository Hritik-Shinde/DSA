class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length < 1){
            return intervals;
        }
        // sort by starting index
        Arrays.sort(intervals,Comparator.comparingInt(a -> a[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        for(int[] interval: intervals){
            if(interval[0]<= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
            else{
                result.add(newInterval);
                newInterval = interval;
            }
            
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);

    }
}