class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int start = 0,end = 0;
        boolean[] isVisited = new boolean[128];
        while(end<s.length()){
            while(isVisited[s.charAt(end)] == true){
                isVisited[s.charAt(start)] = false;
                start++;
            }
            isVisited[s.charAt(end)] = true;
            res = Math.max(res,end-start+1);
            end++;
        }

        return res;
    }
}