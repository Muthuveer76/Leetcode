class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int gift : gifts) {
            pq.offer(gift);
        }

        while (k-- > 0) {
            int max = pq.poll();
            pq.offer((int) Math.sqrt(max));
        }

        long ans = 0;

        while (!pq.isEmpty()) {
            ans += pq.poll();
        }

        return (long)ans;
    }
}