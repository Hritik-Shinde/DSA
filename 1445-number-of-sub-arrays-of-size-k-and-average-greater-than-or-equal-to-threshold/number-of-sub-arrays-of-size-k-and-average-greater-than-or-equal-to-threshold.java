class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n =  arr.length;
        double maxSum = 0;
        int count = 0;
        for(int i =0;i<k;i++)
        {
            maxSum += arr[i];
           
        }
         if(maxSum/k >= threshold){
                count++;
            }

        double windowSum = maxSum;
     
        for(int i = k;i<n;i++){
            windowSum += arr[i] - arr[i-k];
             if(windowSum/k >= threshold){
                count ++;
            }
        }
       
        return count;
    }
}