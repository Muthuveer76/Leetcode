class Solution {
    public int[] evenOddBit(int n) {
        int[] ans=new int[2];
        int i=0;
        while(n>0){
            if((n&1)==1) ans[i%2]++;
            n>>=1;
            i++;
        }
        return ans;
    }
}