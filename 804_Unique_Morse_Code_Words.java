class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                        "...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> res = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String ch = "";
            for (int j = 0; j < words[i].length(); j++) {
                ch += arr[words[i].charAt(j) - 'a'];
            }
            res.add(ch);
        }
        return res.size();
    }
}