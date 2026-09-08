class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int bestSum = nums[0]+nums[1]+nums[2];

        for(int i =0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length -1;
            while(j<k){
                int currentSum = nums[i]+nums[j]+nums[k];
                if(Math.abs(currentSum-target) < Math.abs(bestSum - target)){
                    bestSum = currentSum;
                }if(currentSum == target){
                    return target;
                }
                else if(currentSum> target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return bestSum;
    }
}