class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        res=""
        n=0
        for i in range(len(s)):
            if s[i]=="(":
                if n>0:
                    res+=s[i]
                n+=1
            else:
                n-=1
                if n>0:
                    res+=s[i]
        return res