class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] pair : adjacentPairs) {
            graph.computeIfAbsent(pair[0], x -> new ArrayList<>()).add(pair[1]);
            graph.computeIfAbsent(pair[1], x -> new ArrayList<>()).add(pair[0]);
        }

        int start = 0;

        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            if (entry.getValue().size() == 1) {
                start = entry.getKey();
                break;
            }
        }

        int[] result = new int[adjacentPairs.length + 1];
        result[0] = start;

        for (int i = 1; i < result.length; i++) {
            List<Integer> neighbors = graph.get(result[i - 1]);

            if (neighbors.get(0) != (i >= 2 ? result[i - 2] : Integer.MIN_VALUE)) {
                result[i] = neighbors.get(0);
            } else {
                result[i] = neighbors.get(1);
            }
        }

        return result;
    }
}