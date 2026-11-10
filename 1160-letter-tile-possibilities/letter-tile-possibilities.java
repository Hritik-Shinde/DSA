class Solution {
    public int numTilePossibilities(String tiles) {
        int count = 0;
        int[] freq = new int[26];
        for(int i =0;i< tiles.length() ;i++){
            freq[tiles.charAt(i) - 'A']++;
        } 
      return backtrack(freq);
    }

    private int backtrack(int[] freq){
        int count =0;
         for(int i = 0;i< 26;i++){
            if(freq[i] > 0){
                freq[i]--;
                count += 1;
                count += backtrack(freq);
                freq[i]++;
            }
        }
        return count;
    }
}