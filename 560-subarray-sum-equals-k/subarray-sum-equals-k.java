class Solution {
    public int subarraySum(int[] nums, int k) {
        // brute force
        // int count = 0;
        // for(int i =0;i<nums.length;i++){
        //     int sum = 0;
        //     for(int j=i;j<nums.length;j++){

        //         sum += nums[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int currentPrefix = 0;
        int count = 0;

        for(int i =0;i<nums.length;i++){
            currentPrefix += nums[i];

            int need = currentPrefix- k;
            if(map.containsKey(need)){
                count += map.get(need);
            }
            map.put(currentPrefix, map.getOrDefault(currentPrefix,0)+1);
        }
        return count;
    }
}