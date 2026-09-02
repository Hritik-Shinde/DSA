class Solution {
    public boolean isAnagram(String s, String t) {
        // sort methord 
        // char[] first = s.toCharArray();
        // char[] Second = t.toCharArray();
        // Arrays.sort(first);
        // Arrays.sort(Second);
        // if(Arrays.equals(first,Second)){
        //     return true;
        // }
        // return false;

        // Hashmap 

        HashMap<Character,Integer> freq = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }

        for(int j =0;j<t.length();j++){
            char ch = t.charAt(j);
            if(!freq.containsKey(ch)){
                return false;
            }
                freq.put(ch,freq.get(ch)-1);
                if(freq.get(ch)< 0){
                    return false;
                }
            
        }
        return true;
    }
}