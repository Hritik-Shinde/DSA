class Solution {
    public int[] sortedSquares(int[] nums) {
        // for(int i =0;i<nums.length;i++){
        //     nums[i] = nums[i] *nums[i];
        // }
        // Arrays.sort(nums);

        // return nums;

        // optimise way

        int i = 0, j= nums.length-1, index = nums.length-1;
        int[] ans = new int[nums.length];
        while(i<=j){
          int   isqure = nums[i] *nums[i];
           int  lsqure = nums[j] * nums[j];

            if(isqure > lsqure){
                ans[index] = isqure;
                i++;
            }else{
                ans[index] = lsqure;
                j--;
            }
            index --;
        }

        return ans;
    }
}