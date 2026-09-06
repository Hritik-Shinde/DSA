class Solution {
    public int longestConsecutive(int[] nums) {
        // int res =1 , curr = 1;
        // if(nums.length == 0){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // for(int i =1;i<nums.length;i++){
        //     if(nums[i-1] +1 == nums[i]){
        //          curr++;
        //     }
        //     else if(nums[i-1] == nums[i]){
              
        //     }else{
        //         curr = 1;
        //     }
        //     res = Math.max(res, curr);
        // }

        // return res;
        
        //HashSet

        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num : nums){
            set.add(num);
        }

        for(int num: set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentSum = 1;
                while(set.contains(currentNum+1)){
                    currentNum ++;
                    currentSum++;
                }
                ans = Math.max(ans,currentSum);
            }
            
        }
        return ans;
    }
}