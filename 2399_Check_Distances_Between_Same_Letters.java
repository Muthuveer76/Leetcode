class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] first = new int[26];
        Arrays.fill(first, -1);
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (first[index] == -1) {
                first[index] = i;
            } else {
                if (i - first[index] - 1 != distance[index]) {
                    return false;
                }
            }
        }
        return true;
    }
}