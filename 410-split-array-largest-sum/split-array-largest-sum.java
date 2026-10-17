class Solution {
    public int splitArray(int[] nums, int k) {
        int min = Arrays.stream(nums).max().getAsInt();
        int max = Arrays.stream(nums).sum();
        int res = max;
        while(min <= max){
            int mid = min +(max-min)/2;
            if(canSplit(nums,k,mid)){
                res = mid;
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return res;
    }

    public Boolean canSplit(int[] nums,int k,int mid){
        int subArrays =1;
        int currSum = 0;

        for(int num: nums){
            if(currSum+num > mid){
                subArrays++;
                currSum = num;
                if(subArrays > k) 
                    return false;
            }else{
                currSum += num;
            }
        }
        return true;
    }
}