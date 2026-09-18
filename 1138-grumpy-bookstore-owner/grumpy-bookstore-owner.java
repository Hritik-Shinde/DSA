class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start = 0, end = 0, windowSum = 0 , max =0 , result = 0;
        while(end<customers.length){
            if(grumpy[end] == 0){
                result += customers[end];
            }
            if(grumpy[end] == 1){
                windowSum += customers[end];
            }

            while(end-start+1 > minutes){
                if(grumpy[start] == 1)
                    windowSum -= customers[start];
                start++;
            }

            max = Math.max(windowSum,max);
            
            end++;
        }
        result += max;

        return result;
    }
}