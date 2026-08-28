class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] f = new int[10];
        for (int d : digits) f[d]++;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 8; k += 2) {
                    int[] need = new int[10];
                    need[i]++;
                    need[j]++;
                    need[k]++;
                    boolean ok = true;
                    for (int d = 0; d < 10; d++) {
                        if (need[d] > f[d]) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) list.add(i * 100 + j * 10 + k);
                }
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = list.get(i);
        return ans;
    }
}