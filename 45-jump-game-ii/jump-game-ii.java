class Solution {
    public int jump(int[] nums) {
        int currentend = 0;
        int maxReach = 0;
        int minJump = 0;
        for(int i =0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach,i+nums[i]);
            if(i == currentend){
                minJump++;
                currentend = maxReach;
            }
        }
        return minJump;
    }
}