package Array;

import SingleToneDesignPattern.SimpleLogger;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringNonRepeting {

//    Input: "abcabcbb"
//    Output: 3

    public static int getLongestSubStringNonRepeting(String str) {
        int left = 0;
        int right = 0;
        int max =0;
        Set<Character> set = new HashSet<>();
        for(int i =0;i<str.length();i++){
            int count = 0;
            for(int j =i;j<str.length();j++){
                if(!set.contains(str.charAt(j))){
                    set.add(str.charAt(j));
                    count++;
                    right++;
                }
                else {
                    set.remove(str.charAt(left));
                    left++;
                    max = Math.max(max,right-left-1);
                }
            }
        }
        return max;
    }

}
