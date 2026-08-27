class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] base = new int[26];
        for (char c : s.toCharArray()) base[c - 'a']++;
        for (int i = n - 1; i >= 0; i--) {
            int[] count = base.clone();
            boolean possible = true;
            for (int j = 0; j < i; j++) {
                int x = target.charAt(j) - 'a';
                if (count[x] == 0) {
                    possible = false;
                    break;
                }
                count[x]--;
            }
            if (!possible) continue;
            int cur = target.charAt(i) - 'a';
            for (int c = cur + 1; c < 26; c++) {
                if (count[c] > 0) {
                    StringBuilder ans = new StringBuilder();
                    for (int j = 0; j < i; j++) ans.append(target.charAt(j));
                    ans.append((char)('a' + c));
                    count[c]--;
                    for (int x = 0; x < 26; x++) {
                        while (count[x] > 0) {
                            ans.append((char)('a' + x));
                            count[x]--;
                        }
                    }
                    return ans.toString();
                }
            }
        }
        return "";
    }
}