class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String i : sentences){
            int temp = i.split(" ").length;
            if(temp > count){
                count = temp;
            }
        }
        return count;
    }
}