class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];

            map.putIfAbsent(size, new ArrayList<>());
            List<Integer> list = map.get(size);
            list.add(i);

            if (list.size() == size) {
                ans.add(new ArrayList<>(list));
                list.clear();
            }
        }

        return ans;
    }
}