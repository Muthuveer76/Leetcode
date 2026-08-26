class Solution:
    def maxFreqSum(self, s: str) -> int:
        mp = {}

        for i in range(len(s)):
            mp[s[i]] = mp.get(s[i], 0) + 1

        ans = 0
        res = 0

        for i in mp:
            if i in "aeiou":
                ans = max(ans, mp[i])
            else:
                res = max(res, mp[i])

        return ans + res