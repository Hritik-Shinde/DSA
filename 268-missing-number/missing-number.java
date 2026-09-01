class Solution {
    public int missingNumber(int[] nums) {
        // Hashset
        // HashSet<Integer> hs = new HashSet<>();
        // for(int i =0;i<nums.length;i++){
        //     hs.add(nums[i]);
        // }
        // for(int i =0;i<nums.length;i++){
        //     if(!hs.contains(i))
        //         return i;
        // }
        // return nums.length;
         
        // using sort 

        // Arrays.sort(nums);
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i] != i){
        //         return i;
        //     }
        // }
        // return nums.length;

        //formula 
        int n = nums.length;
        long expectedSum = (long) n *(n +1)/2;
        long actuallSum = 0;
        for(int num: nums){
            actuallSum += num;
        }

        return (int) (expectedSum - actuallSum);

    }
}