class Solution:
    def mapWordWeights(self, words: List[str], weights: List[int]) -> str:
        ans = []
        for i in words:
            str1 = sum(weights[ord(c) - 97] for c in i) % 26
            ans.append(chr(122 - str1))
        return ''.join(ans)