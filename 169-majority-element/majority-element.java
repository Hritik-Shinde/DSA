class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int i =0;i<nums.length;i++){
        //     int count = map.getOrDefault(nums[i],0)+1;
        //     map.put(nums[i],count);
        //     if(count>nums.length/2){
        //         return nums[i];
        //     }
        // }
        // return -1;


        // boyer moore algo

        int vote = 0;
        int candiate = -1;

        for(int i =0;i<nums.length;i++){
            if(vote == 0){
                candiate = nums[i];
                vote++;
            }
            else if(candiate == nums[i]){
                vote++;
            }
            else{
                vote--;
            }

        }
        return candiate;
    }
}