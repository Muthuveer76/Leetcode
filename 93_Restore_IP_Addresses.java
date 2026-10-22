class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, new StringBuilder(), result);
        return result;
    }
    public void backtrack(String s, int index, int parts,
                           StringBuilder current, List<String> result) {
        if (parts == 4) {
            if (index == s.length()) {
                result.add(current.toString());
            }
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);

            if (segment.length() > 1 && segment.charAt(0) == '0') {
                break;
            }

            if (Integer.parseInt(segment) > 255) {
                break;
            }

            int oldLength = current.length();

            if (parts > 0) {
                current.append('.');
            }

            current.append(segment);

            backtrack(s, index + len, parts + 1, current, result);

            current.setLength(oldLength);
        }
    }
}