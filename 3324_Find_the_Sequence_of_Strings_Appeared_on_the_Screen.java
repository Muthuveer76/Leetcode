class Solution {
    public List<String> stringSequence(String target) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (char targetChar : target.toCharArray()) {
            current.append('a');

            for (char c = 'a'; c <= targetChar; c++) {
                current.setCharAt(current.length() - 1, c);
                result.add(current.toString());
            }
        }

        return result;
    }
}