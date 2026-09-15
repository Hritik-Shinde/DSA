class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0, end = 0, maxLen = 0, sum = 0;
        while (end < s.length()) {
            sum += Math.abs(s.charAt(end) - t.charAt(end));
            while (sum > maxCost) {
                sum -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }
        return maxLen;
    }
}