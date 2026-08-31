class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i =0;i<nums.length- 1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        } 
        return ans;
    }
    // if sorted array
    //  public int[] twoSum(int[] nums, int target) {

    //     int left = 0;
    //     int right = nums.length - 1;

    //     while (left < right) {

    //         int sum = nums[left] + nums[right];

    //         if (sum == target) {
    //             return new int[]{left, right};
    //         }

    //         if (sum < target) {
    //             left++;
    //         } else {
    //             right--;
    //         }
    //     }

    //     return new int[]{-1, -1};
    // }
}