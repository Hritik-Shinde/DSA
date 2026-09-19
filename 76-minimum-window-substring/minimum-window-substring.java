class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> targetFreq = new HashMap<>();
        for(char c: t.toCharArray()){
            targetFreq.put(c,targetFreq.getOrDefault(c,0)+1);
        }

        int start = 0 , end = 0 ,minlength = Integer.MAX_VALUE, minLeft = 0, formed = 0;
        int required = targetFreq.size(); 

        HashMap<Character,Integer> windowFreq = new HashMap<>();
        while(end<s.length()){
            char c = s.charAt(end);
            windowFreq.put(c,windowFreq.getOrDefault(c,0)+1);
            if(targetFreq.containsKey(c) && windowFreq.get(c).intValue() == targetFreq.get(c).intValue()){
                formed++;
            }

            while(start <= end && formed == required){
                if( (end -start +1) < minlength){
                    minlength = end-start+1;
                    minLeft = start;
                }
                char ch = s.charAt(start);
                windowFreq.put(ch,windowFreq.get(ch)-1);
                if(targetFreq.containsKey(ch) && windowFreq.get(ch) < targetFreq.get(ch)){
                    formed --;
                }

                start++;
            }

            end++;

        }

    return minlength == Integer.MAX_VALUE ? "" : s.substring(minLeft,minLeft+minlength);
    }
}