class Solution {
    public List<String> topKFrequent(String[] words, int k) {
             // Step 1: Count word frequencies
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Step 2: Min-heap with custom comparator
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                int freqA = freq.get(a);
                int freqB = freq.get(b);

                if (freqA == freqB) {
                    return b.compareTo(a);
                }

                return Integer.compare(freqA, freqB);
            }
        );

        // Step 3: Maintain heap of size k
        for (String word : freq.keySet()) {
            pq.offer(word);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Extract result
        List<String> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        // Step 5: Reverse to get correct order
        Collections.reverse(result);

        return result;
    
    }
}