class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // HashSet<List<Integer>> set = new HashSet<>();
        // for(int i =0;i<nums.length;i++){
        //     for(int j =i+1;j<nums.length;j++){
        //         for(int k = j+1;k<nums.length;k++){
        //             if(nums[i]+nums[j]+nums[k] == 0){
        //                 ArrayList<Integer> ans = new ArrayList<>();
        //                 ans.add(nums[i]);
        //                 ans.add(nums[j]);
        //                 ans.add(nums[k]);
        //                 Collections.sort(ans);
        //                 set.add(ans);
        //             }
        //         }
        //     }
        // }

        // return new ArrayList<>(set); tle
        int sum =0;   
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length -1;

            while(left < right){
                sum = nums[i] +nums[left]+nums[right];
                if(sum == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    left++;
                    right--;

                    while(left<right && nums[left-1] == nums[left] ){
                        left++;
                    }
                    while(left<right && nums[right+1] == nums[right]){
                        right--;
                    }
                }
                else if(sum>0){
                    right--;
                }
                else{
                    left ++;
                }
            }

        }
        return ans;
    }
}