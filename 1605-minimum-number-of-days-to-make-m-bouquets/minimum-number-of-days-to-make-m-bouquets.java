
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Not enough flowers to make m bouquets
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        // Find minimum and maximum bloom days
        for (int day : bloomDay) {
            start = Math.min(start, day);
            end = Math.max(end, day);
        }

        // Binary search on number of days
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean canMakeBouquets(
        int[] bloomDay, int m, int k, int day
    ) {
        int consecutive = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                consecutive++;

                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0;

                    if (bouquets >= m) {
                        return true;
                    }
                }
            } else {
                consecutive = 0;
            }
        }

        return false;
    }
}
