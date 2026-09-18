class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0,end = 0 , countZero = 0, maxLength = 0;
        while(end<nums.length){
            if(nums[end] == 0){
                countZero++;
            }

            while(countZero > k){
                if(nums[start] == 0)
                    countZero--;
                start++;
            }
            maxLength = Math.max(maxLength,end-start+1);
            end++;
        }

        return maxLength;

    }
}