class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq =new int[26];
        for(char task: tasks){
            freq[task-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int count:freq){
            if(count > 0){
                pq.offer(count);
            }
        }

        int time = 0;
        while(!pq.isEmpty()){
            int cycle = n+1;
            List<Integer> temp = new ArrayList<>();
            int executed = 0;
            while(!pq.isEmpty() && cycle > 0){
                int count = pq.poll();
                count--;
                if(count > 0){
                    temp.add(count);
                }
                executed++;
                cycle --;
            }
               for (int count : temp) {
                pq.offer(count);
            }
                if(pq.isEmpty()){
            time += executed;
        }else{
            time += n+1;
        }

        }

    

        return time;

    }
}