class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        List<Integer> result = new ArrayList<>();

        for (int num : nums1) {
            count[num]++;
        }

        for (int num : nums2) {
            if (count[num] > 0) {
                result.add(num);
                count[num]--;
            }
        }

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}