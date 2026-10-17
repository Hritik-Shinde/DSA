class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int min = Arrays.stream(weights).max().getAsInt();
        int max = Arrays.stream(weights).sum();

        int result = max;

        while(min <= max){
            int mid = min + (max-min)/2;

            if(check(weights,mid,days)){
                max = mid-1;
                result = mid;
            }else{
                min = mid+1;
            }
        }
        return result;
    }


    public Boolean check(int[] weights,int mid,int days){
        int totaldays = 1;
        int currentWeight = 0;

        for(int weight: weights){
            if(currentWeight+weight>mid){
                totaldays++;
                currentWeight = weight;
            }else{
                currentWeight+= weight;
            }
        }

        return totaldays <= days;
    }
}