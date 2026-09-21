class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // brute force
        // if(nums.length < 2){
        //     return false;
        // }
        // for(int i =0;i<nums.length;i++){
        //     int sum = 0;
        //     for(int j =i;j<nums.length;j++){
        //         sum += nums[j];

        //         if(sum %  k == 0 && j-i+1>=2){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefix =0;
        for(int i =0;i<nums.length;i++){
            prefix += nums[i];

            int reminder = prefix %k;
            if(map.containsKey(reminder)) {
                if(i-map.get(reminder) >= 2){
                    return true;
                }
            }

            map.putIfAbsent(reminder,i);
        }
        return false;
    }
}