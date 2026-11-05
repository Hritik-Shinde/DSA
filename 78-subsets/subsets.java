class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        backtrack(nums,0,result,curr);

        return result;
    }

    private void backtrack(int[] nums, int index, List<List<Integer>> result, List<Integer> curr){
        if(index == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);
        backtrack(nums,index+1,result,curr);

        curr.remove(curr.size() -1);

        backtrack(nums,index+1,result,curr);
    }
}