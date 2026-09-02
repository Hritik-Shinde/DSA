class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> freq = new HashMap<>();
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        for(int i =0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            int count = freq.getOrDefault(ch,0)+1;
            freq.put(ch,count);
        }

        for(int i =0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(!freq.containsKey(ch)){
                return false;
            }

            freq.put(ch,freq.get(ch)-1);
            if(freq.get(ch) < 0 ){
                return false;
            }
        }
        return true;
    }
}