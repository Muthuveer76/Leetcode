class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int countG = 0;
        int countS = 0;
        while(countG < g.length && countS < s.length){
            if(s[countS] >= g[countG]){
                countG++;
            }
            countS++;
        }
        return countG;
    }
}