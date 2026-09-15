class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0 ,end =0 , maxLength = 0,maxFreq= 0;
        int[] freq = new int[26];

        while(end<s.length()){
            // update the data in frequency array
            freq[s.charAt(end) - 'A']++;
            // check the character frequency current or previous
            maxFreq = Math.max(maxFreq,freq[s.charAt(end)-'A']);
            while((end-start+1)-maxFreq >k){
                freq[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength,end-start+1);
            end++;
        }

        return maxLength;
    }
}