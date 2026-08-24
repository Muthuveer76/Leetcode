class Solution {
    public boolean digitCount(String num) {
        int[] arr = new int[10];
        for (char c : num.toCharArray()) {
            arr[c - '0']++;
        }
        for (int i = 0; i < num.length(); i++) {
            int temp = num.charAt(i) - '0';
            if (arr[i] != temp) {
                return false;
            }
        }
        return true;
    }
}