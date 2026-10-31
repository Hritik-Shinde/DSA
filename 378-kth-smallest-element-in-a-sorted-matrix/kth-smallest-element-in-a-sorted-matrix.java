class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int n = matrix.length;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{
                matrix[i][0],
                i,
                0
            });
        }

        int answer = -1;

        while (k > 0) {

            int[] smallest = pq.poll();

            answer = smallest[0];

            int row = smallest[1];
            int col = smallest[2];

            if (col + 1 < n) {
                pq.offer(new int[]{
                    matrix[row][col + 1],
                    row,
                    col + 1
                });
            }

            k--;
        }

        return answer;
    }
}