class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (i < j && !Character.isLetter(arr[i])) {
                i++;
            }
            while (i < j && !Character.isLetter(arr[j])) {
                j--;
            }
            if (i < j) {
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                i++;
                j--;
            }
        }
        i = 0;
        j = arr.length - 1;
        while (i < j) {
            while (i < j && Character.isLetter(arr[i])) {
                i++;
            }
            while (i < j && Character.isLetter(arr[j])) {
                j--;
            }
            if (i < j) {
                char ch = arr[i];
                arr[i] = arr[j];
                arr[j] = ch;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}