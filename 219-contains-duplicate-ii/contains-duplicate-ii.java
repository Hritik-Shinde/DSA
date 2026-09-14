class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int start = 0, end = 0;
        while(end<nums.length){
            if(end - start >  k){
                set.remove(nums[start]);
                start++;
            }
            if(set.contains(nums[end])){
                return true;
            }
            set.add(nums[end]);
            end++;
        }
        return false;
}
}