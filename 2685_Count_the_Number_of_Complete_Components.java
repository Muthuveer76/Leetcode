class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int vertices = 0;
            int edgeCount = 0;
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            visited[i] = true;

            while (!queue.isEmpty()) {
                int node = queue.poll();
                vertices++;
                edgeCount += graph.get(node).size();

                for (int next : graph.get(node)) {
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.offer(next);
                    }
                }
            }

            edgeCount /= 2;

            if (edgeCount == vertices * (vertices - 1) / 2) {
                result++;
            }
        }

        return result;
    }
}