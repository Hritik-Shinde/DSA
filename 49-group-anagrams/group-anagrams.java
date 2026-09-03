class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // hashmap solutions
        // HashMap<String,List<String>> map = new HashMap<>();

        // for(String str : strs){
        //     char[] ch = str.toCharArray();
        //     Arrays.sort(ch);

        //     String key = new String(ch);
        //     if(!map.containsKey(key)){
        //         List<String> list = new ArrayList<>();
        //         list.add(str);
        //         map.put(key,list);
        //     } else{
        //         map.get(key).add(str);
        //     }
        // }

        // return new ArrayList<>(map.values());

        // optimized approch

        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String str: strs){
            int[] freq = new int[26];
            for(char ch : str.toCharArray()){
                freq[ch - 'a'] ++;
            }
            String key = Arrays.toString(freq);
            if(!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }else{
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}