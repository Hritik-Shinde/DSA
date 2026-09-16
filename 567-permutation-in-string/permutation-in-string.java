class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for(int i =0;i<s1.length();i++)
        {
            freq[s1.charAt(i) - 'a']++;
        }
        int start = 0 , end = 0;
        while(end <s2.length()){
            
            freq[s2.charAt(end) - 'a']--;
            while(end - start+1 > s1.length()){
                freq[s2.charAt(start) - 'a']++;
                start++;
            }
            if(end-start+1 == s1.length()){
                boolean matches = true;
                for(int i =0;i<freq.length;i++){
                    if(freq[i] != 0){
                        matches = false;
                        break;
                    }
                }
                if(matches){
                    return true;
                }
            }
            end ++;

        }
        return false;
    }
}