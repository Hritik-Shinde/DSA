
class Solution {
    public String reorganizeString(String s) {

        int n = s.length();

        // Step 1: Count character frequencies
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;                  // Blank 1
        }

        // Step 2: Create max heap based on frequency
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(
                (a, b) -> freq[b] - freq[a]           // Blank 2
            );

        // Step 3: Insert character indices
        for (int i = 0; i < 26; i++) {

            if (freq[i] > 0) {                  // Blank 3
                pq.offer(i);          // Blank 4
            }
        }

        StringBuilder sb = new StringBuilder();

        // Step 4: Greedy selection
        while (pq.size() >=2) {                   // Blank 5

            int ch1 = pq.poll();
            int ch2 = pq.poll();

            // Step 5: Append characters
            sb.append((char) ('a' + ch1));             // Blank 6
            sb.append((char) ('a' + ch2));             // Blank 7

            // Step 6: Decrease frequencies
            freq[ch1]--;                // Blank 8
            freq[ch2]--;                // Blank 9

            // Step 7: Reinsert remaining characters
            if (freq[ch1] > 0) {
                pq.offer(ch1);          // Blank 10
            }

            if (freq[ch2] > 0) {
                pq.offer(ch2);          // Blank 11
            }
        }

        // Step 8: Handle last character
        if (!pq.isEmpty()) {

            int last = pq.poll();

            if (freq[last] > 1) {
                return "";
            }

            sb.append((char) ('a' + last));
        }
        if (!pq.isEmpty()) {
    int last = pq.poll();

    if (freq[last] > 1) {
        return "";
    }

    sb.append((char) ('a' + last));
}
        // Step 9: Return result
        return sb.toString();                     // Blank 12
    }
}