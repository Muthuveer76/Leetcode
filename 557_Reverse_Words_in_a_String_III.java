class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        while (i < arr.length) {
            int j = i;
            while (j < arr.length && arr[j] != ' ') {
                j++;
            }
            int count = j - 1;
            while (i < count) {
                char ch = arr[i];
                arr[i] = arr[count];
                arr[count] = ch;
                i++;
                count--;
            }
            i = j + 1;
        }
        return new String(arr);
    }
}