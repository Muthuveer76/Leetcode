class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        n = start ^ goal
        ans = 0

        while n:
            ans += n & 1
            n >>= 1

        return ans