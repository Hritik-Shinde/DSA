class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       //brute force
      
    //    int count = 0;
    //    for(int i =0;i<nums.length;i++){
    //      HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int j = i;j<nums.length;j++){
    //         map.put(nums[j],map.getOrDefault(nums[j],0)+1);
    //         if(map.size()== k){
    //             count ++;
    //         }
    //         if(map.size() > k){
    //             break;
    //         }
    //     }
        
    //    }
    //     return count;
       // optimized
        return atMostK(nums,k)- atMostK(nums,k-1);
    }

    public int atMostK(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int start = 0;
        for(int end = 0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            if(map.get(nums[end]) == 1){
                k--;
            }
            while(k <0){
                map.put(nums[start],map.get(nums[start])-1);
                if(map.get(nums[start]) == 0){
                    k++;
                }
                start++;
            }

            count += (end-start+1);
        }
        return count;
    }
}