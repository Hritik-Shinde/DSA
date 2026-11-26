class Solution {
  

    public boolean canPartition(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0)
            return false;

        int target = totalSum / 2;

        // Corrected line
        boolean[][] dp = new boolean[nums.length + 1][target + 1];

        for (int i = 0; i <= nums.length; i++) {
            dp[i][0] = true;
        }

        for (int index = nums.length - 1; index >= 0; index--) {
            for (int t = 1; t <= target; t++) {

                boolean pick = false;

                if (nums[index] <= t) {
                    pick = dp[index + 1][t - nums[index]];
                }

                boolean noPick = dp[index + 1][t];

                dp[index][t] = pick || noPick;
            }
        }

        return dp[0][target];
    }



    // private boolean solve(int[] nums,int index,int target,Boolean[][] dp){

    //     if(target == 0){
    //         return true;
    //     }

    //     if(index == nums.length || target<0){
    //         return false;
    //     }

    //     boolean pick = solve(nums,index+1,target-nums[index],dp);
    //     boolean noPick = solve(nums,index+1,target,dp);

    //     return dp[index][target] =pick || noPick;

    // }
}