class Solution {
    // public int[] searchRange(int[] nums, int target) {
    //     int[] ans = new int[2];
    //     ans[0] =-1;
    //     ans[1] =-1;
    //     int start = 0,end = nums.length-1;
    //     while(start<=end){
    //         int mid = start+(end-start)/2;
    //         if(nums[mid] == target){
    //             ans[0] = mid;
    //             end = mid -1;
    //         }
    //         else if(nums[mid] > target){
    //             end = mid-1;
    //         }
    //         else{
    //             start = mid+1;
    //         }
    //     }

    //     start =0;end = nums.length-1;
    //     while(start<=end){
    //         int mid = start +(end-start)/2;
    //         if(nums[mid] == target){
    //             ans[1] = mid;
    //             start = mid+1;
    //         }
    //         else if(nums[mid]> target){
    //             end = mid -1;
    //         }else{
    //             start = mid +1;
    //         }
    //     }
    //     return ans;

    // }

       public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        int firstIndex = searchElementInArray(nums,target,true);
        int lastIndex =  searchElementInArray(nums,target,false);
        ans[0] = firstIndex;
        ans[1] = lastIndex;
        return ans;
    }

    public int searchElementInArray(int[] nums,int target,boolean findFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            }
            else if(target>nums[mid]){
                start = mid +1;
            }
            else{
                ans = mid;
                if(findFirstIndex){
                    end = mid - 1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}