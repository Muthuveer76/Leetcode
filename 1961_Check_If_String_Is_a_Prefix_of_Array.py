class Solution:
    def isPrefixString(self, s: str, words: List[str]) -> bool:
        string = ""
        for i in words:
            string += i
            if string == s:
                return True
            if len(string) > len(s):
                return False
        return False