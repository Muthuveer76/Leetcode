class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        Deque<Integer> q = new ArrayDeque<>();
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            q.add(i);
        }

        int[] ans = new int[n];

        for (int card : deck) {
            int index = q.poll();
            ans[index] = card;

            if (!q.isEmpty()) {
                q.add(q.poll());
            }
        }

        return ans;
    }
}