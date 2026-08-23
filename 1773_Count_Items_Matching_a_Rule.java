class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int temp = 0;
        if(ruleKey.equals("color")){
            temp = 2;
        }
        if(ruleKey.equals("type")){
            temp = 1;
        }
        if(ruleKey.equals("name")){
            temp = 3;
        }
        int count = 0;
        for(int i = 0 ; i < items.size() ; i++){
            if (items.get(i).get(temp-1).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}