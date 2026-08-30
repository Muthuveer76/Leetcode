class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Set<Integer> set = new HashSet<>();

        for (int bulb : bulbs) {
            if (set.contains(bulb)) {
                set.remove(bulb);
            } else {
                set.add(bulb);
            }
        }

        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);

        return ans;
    }
}