class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String, Integer> map = new HashMap<>();

        for (List<String> response : responses) {
            Set<String> set = new HashSet<>(response);

            for (String s : set) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }

        String ans = "";

        for (String s : map.keySet()) {
            if (ans.equals("") || map.get(s) > map.get(ans) ||
                (map.get(s).equals(map.get(ans)) && s.compareTo(ans) < 0)) {
                ans = s;
            }
        }

        return ans;
    }
}