class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int[] weight = new int[1001];

        for (int[] item : items1) {
            weight[item[0]] += item[1];
        }

        for (int[] item : items2) {
            weight[item[0]] += item[1];
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {
            if (weight[i] > 0) {
                ans.add(Arrays.asList(i, weight[i]));
            }
        }

        return ans;
    }
}