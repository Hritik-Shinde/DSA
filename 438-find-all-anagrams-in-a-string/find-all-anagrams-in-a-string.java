class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int n1 = p.length();
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[26];
        for(int i =0;i<n1;i++){
            freq[p.charAt(i) - 'a']++;
        }

        int start = 0;
        for(int end = 0;end<n;end++){
            freq[s.charAt(end)-'a']--;

            if(end-start + 1 > n1){
                freq[s.charAt(start) - 'a']++;
                start++;
            }

            if(end-start+1 == n1){
                boolean isValid = true;
                for(int i =0;i<freq.length;i++){
                    if(freq[i] != 0){
                        isValid = false;
                        break;
                    }
                }

                if(isValid){    
                    ans.add(start);
                }
            }
        }
        return ans;
    }
}