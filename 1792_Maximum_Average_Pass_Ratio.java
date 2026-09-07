class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(gain(b), gain(a))
        );

        for (int[] c : classes) {
            pq.offer(new double[]{c[0], c[1]});
        }

        while (extraStudents-- > 0) {
            double[] cur = pq.poll();
            cur[0]++;
            cur[1]++;
            pq.offer(cur);
        }

        double sum = 0;

        while (!pq.isEmpty()) {
            double[] cur = pq.poll();
            sum += cur[0] / cur[1];
        }

        return sum / classes.length;
    }

    private double gain(double[] c) {
        return (c[0] + 1) / (c[1] + 1) - c[0] / c[1];
    }
}