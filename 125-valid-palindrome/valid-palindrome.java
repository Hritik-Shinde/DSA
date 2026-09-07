class Solution {
    public boolean isPalindrome(String s) {
        String ns = s.toLowerCase();
        ns = ns.replaceAll("[^a-z0-9]","");
        if(ns.length() == 0){
            return true;
        }
        int i =0,j = ns.length()-1;
        char[] ch = ns.toCharArray();
        while(i<j){
            if(ch[i] != ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}