class Solution {
    public int missingNumber(int[] nums) {
        // hashset
        // HashSet<Integer> hs = new HashSet<>();
        // for(int i =1;i<nums.length;i++){
        //     hs.add(i);
        // }
        // for(int i =0;i<nums.length;i++){
        //     if(!hs.contains(nums[i]))
        //         return nums[i];
        // }
         
        // using sort 

        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;

    }
}