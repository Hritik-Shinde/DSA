class Solution {
    public int totalFruit(int[] fruits) {
        int start = 0, end = 0, maxLength = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(end<fruits.length){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while(map.size() > 2){
                map.put(fruits[start],map.get(fruits[start])-1);
                if(map.get(fruits[start])==0){
                    map.remove(fruits[start]);
                   
                }
                 start++;
            }
            maxLength = Math.max(maxLength,end- start+1);
            end++;
        }

        return maxLength;
    }
}