class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int i =0,j=0;
        while(i<firstList.length && j<secondList.length){
            int[] first = firstList[i];
            int[] second = secondList[j];

            int start = Math.max(first[0],second[0]);
            int end = Math.min(first[1],second[1]);

            if(start<=end){
                result.add(new int[]{start,end});
            }
            if(first[1]>second[1]){
                j++;
            }else{
                i++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}