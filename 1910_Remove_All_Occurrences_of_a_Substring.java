class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(c);

            if (sb.length() >= part.length()) {
                int start = sb.length() - part.length();
                boolean match = true;

                for (int j = 0; j < part.length(); j++) {
                    if (sb.charAt(start + j) != part.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    sb.delete(start, sb.length());
                }
            }
        }

        return sb.toString();
    }
}