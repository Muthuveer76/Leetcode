class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        mp={}
        n=0
        for i in range(len(key)):
            if key[i]!=" " and key[i] not in mp:
                mp[key[i]]=chr(97+n)
                n+=1
        res=""
        for i in range(len(message)):
            if message[i]==" ":
                res+=" "
            else:
                res+=mp[message[i]]
        return res