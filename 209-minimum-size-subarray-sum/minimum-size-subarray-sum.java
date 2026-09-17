class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int start = 0,end = 0;
        int sum = 0;
        while(end<nums.length){
            sum += nums[end];
            while(sum >= target){
                ans = Math.min(ans,end-start+1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        if(ans == Integer.MAX_VALUE ){
            return 0;
        }
        else{
            return ans;
        }
    }
}