class Solution {
    public boolean isIsomorphic(String s, String t) {
    //     HashMap<Character,Character> mapS  = new HashMap<>();
    //     HashMap<Character,Character> mapT = new HashMap<>();
    //     if(s.length() != t.length()){
    //         return false;
    //     }
    //     for(int i =0;i<s.length();i++){
    //         char chs = s.charAt(i);
    //         char csT = t.charAt(i);
    //         if(mapS.containsKey(chs)){
    //             if(mapS.get(chs) != csT){
    //                 return false;
    //             }
    //         }
    //         else{
    //                 mapS.put(chs,csT);
    //          }
            
    //         if(mapT.containsKey(csT)){
    //             if(mapT.get(csT) != chs){
    //                 return false;
    //             }
               
    //         }
    //          else{
    //                 mapT.put(csT,chs);
    //             }
    //     }

    // return true;

    HashMap<Character,Character> map = new HashMap<>();
    for(int i =0;i<s.length();i++){
        char chs = s.charAt(i);
        char cht = t.charAt(i);

        if(map.containsKey(chs)){
            if(map.get(chs) != cht){
                return false;
            }
        }
        else{
        if(map.containsValue(cht)){
         
                return false;
            
        }
            map.put(chs,cht);
        
        }
    }

    return true;
}}