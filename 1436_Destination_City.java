class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> from = new HashSet<>();
        for (List<String> p : paths) from.add(p.get(0));
        for (List<String> p : paths) {
            if (!from.contains(p.get(1))) return p.get(1);
        }
        return "";
    }
}