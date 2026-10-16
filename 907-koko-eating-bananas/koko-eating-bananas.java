class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for(int pile:piles){
           end = Math.max(end,pile);
        }
       
        while(start<end){
            long totalhours =0;
            int mid = start+(end-start)/2;

            for(int pile: piles){
                int hours = pile/mid;
                if(pile%mid != 0){
                    hours++;
                }

                totalhours += hours;
            }

             if(totalhours > h){
                start = mid+1;
                }else{
                    end = mid;
                }

        }

        return start;
    }
}