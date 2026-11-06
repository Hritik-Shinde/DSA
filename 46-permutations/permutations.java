class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(result,curr,nums);
        return result;
    }
    private void backtrack(List<List<Integer>>result,List<Integer> curr,int[] nums){
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0;i<nums.length;i++){
            if(curr.contains(nums[i])){
                continue;
            }
            curr.add(nums[i]);
            backtrack(result,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
}