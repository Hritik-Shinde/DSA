class Solution {
    public int longestConsecutive(int[] nums) {
        int res =1 , curr = 1;
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i =1;i<nums.length;i++){
            if(nums[i-1] +1 == nums[i]){
                 curr++;
            }
            else if(nums[i-1] == nums[i]){
              
            }else{
                curr = 1;
            }
            res = Math.max(res, curr);
        }

        return res;
    }
}