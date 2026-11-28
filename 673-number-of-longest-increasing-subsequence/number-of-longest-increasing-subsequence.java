class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[nums.length];
        int[] count = new int[nums.length];

        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int maxlength =1 ;
        for(int i =1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1 > dp[i]){
                        dp[i] = dp[j]+1;
                        count[i] = count[j];
                    }else if(dp[j]+1 == dp[i]){
                        count[i] += count[j];
                    }
                }

                maxlength = Math.max(maxlength,dp[i]);
            }
        }

        int ans = 0;
        for(int i =0;i<n;i++){
            if(dp[i] == maxlength){
                ans+= count[i];
            }
        }

        return ans;
    }
}