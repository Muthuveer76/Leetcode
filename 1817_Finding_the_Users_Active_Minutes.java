class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] log : logs) {
            map.putIfAbsent(log[0], new HashSet<>());
            map.get(log[0]).add(log[1]);
        }

        int[] answer = new int[k];

        for (Set<Integer> times : map.values()) {
            answer[times.size() - 1]++;
        }

        return answer;
    }
}