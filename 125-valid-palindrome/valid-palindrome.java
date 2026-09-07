class Solution {
    public boolean isPalindrome(String s) {
        // String ns = s.toLowerCase();
        // ns = ns.replaceAll("[^a-z0-9]","");
        // if(ns.length() == 0){
        //     return true;
        // }
        // int i =0,j = ns.length()-1;
        // char[] ch = ns.toCharArray();
        // while(i<j){
        //     if(ch[i] != ch[j]){
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;

        int i =0;
        int j = s.length() -1;
        while(i<j){
            while(i<j &&!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }

            while(i<j &&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    
}