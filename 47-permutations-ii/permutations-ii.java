class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums,result,curr,used);
        return result;
    }

    private void backtracking(int[] nums,List<List<Integer>> result, List<Integer> curr , boolean[] isUsed){
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i =0;i<nums.length;i++){
            if(isUsed[i]){
                continue;
            }

            if(i>0&& nums[i] == nums[i-1] && !isUsed[i-1]){
                continue;
            }

            curr.add(nums[i]);
            isUsed[i] =  true;
            backtracking(nums,result,curr,isUsed);
            curr.remove(curr.size()-1);
            isUsed[i] = false;
        }
    }
}