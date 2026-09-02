class Solution {
    public boolean isAnagram(String s, String t) {
        // sort methord 
        char[] first = s.toCharArray();
        char[] Second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(Second);
        if(Arrays.equals(first,Second)){
            return true;
        }
        return false;
    }
}