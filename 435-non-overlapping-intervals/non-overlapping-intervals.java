class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        int[] newInterval = intervals[0];
        int count =0 ;
        for(int i =1;i<intervals.length;i++){
            int[] interval = intervals[i];
            if(newInterval[1]>interval[0]){
                count++;
                interval[1] = Math.min(newInterval[1],interval[1]);
            }
            newInterval=interval;
        }
        return count;
    }
}