class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int[] previousPoint = points[0];
        int count = 1;
        for(int i =1;i<points.length;i++){
           int[] currentPoint = points[i]; 

           if(currentPoint[0]<=previousPoint[1]){
                previousPoint[1] = Math.min(currentPoint[1],previousPoint[1]);
                
           }else{
            count++;
             previousPoint = currentPoint ;
           }
        }

        return count;
    }
}