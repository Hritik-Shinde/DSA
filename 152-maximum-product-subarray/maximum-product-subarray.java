class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0;i<n;i++){
            int product = 1;
            for(int j=i;j<n;j++){
                product *= nums[j];
                ans = Math.max(ans,product);
            }
        }

         return ans;

        // kadens donr use will not work
        // int currentSum = nums[0];
        // int maxSum = nums[0];

        // int n = nums.length;
        // for(int i =1;i<n;i++){
        //     currentSum = Math.max(currentSum+nums[i],nums[i]);
        //     maxSum = Math.max(currentSum,maxSum);
        // }  

        // return maxSum;
    }
}