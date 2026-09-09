class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i =0;i<nums.length;i++){
        //     for(int j = i+1;j<nums.length;j++){
        //         if(nums[i] == 0 && nums[j] != 0){
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }
        // 2 nd approch
        // int i = 0;
        // int j = i+1;
        // while(i<j && j< nums.length){
        //     if(nums[i] == 0 && nums[j] !=0 )
        //     {
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         i++;
        //         j++;
        //     }
        //     else if(nums[i] != 0){
        //         i++;
        //         j++;
        //     }
        //     else if(nums[j] == 0 && nums[i] == 0){
        //         j++;
        //     }
        // }

        // optimise 
        int i =0;
        for(int j =0;j<nums.length;j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}