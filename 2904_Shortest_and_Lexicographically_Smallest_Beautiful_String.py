class Solution:
    def shortestBeautifulSubstring(self, s: str, k: int) -> str:
        pos = [i for i, c in enumerate(s) if c == '1']

        if len(pos) < k:
            return ""

        ans = None

        for i in range(len(pos) - k + 1):
            candidate = s[pos[i]:pos[i + k - 1] + 1]

            if (ans is None or
                len(candidate) < len(ans) or
                (len(candidate) == len(ans) and candidate < ans)):
                ans = candidate

        return ans