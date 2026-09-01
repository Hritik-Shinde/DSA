class Solution {
    public boolean containsDuplicate(int[] nums) {
    //    for(int i =0;i<nums.length;i++){
    //         for(int j =i+1;j<nums.length;j++){
    //             if(nums[i] == nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;

        HashSet<Integer> ans = new HashSet<>();
        for(int num:nums){
            if(ans.contains(num)){
                return true;
            }
            else{
                ans.add(num);
            }
        }
        return false;
    }
}