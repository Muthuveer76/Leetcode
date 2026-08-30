class Solution {
    public String[] findWords(String[] words) {
        String[] rows={"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> ans=new ArrayList<>();
        for(String word:words){
            String s=word.toLowerCase();
            int row=-1;
            for(int i=0;i<3;i++){
                if(rows[i].indexOf(s.charAt(0))>=0){
                    row=i;
                    break;
                }
            }
            boolean ok=true;
            for(char c:s.toCharArray()){
                if(rows[row].indexOf(c)<0){
                    ok=false;
                    break;
                }
            }
            if(ok) ans.add(word);
        }
        return ans.toArray(new String[0]);
    }
}