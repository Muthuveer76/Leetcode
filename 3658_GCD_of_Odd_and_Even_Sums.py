class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        ans = 0
        res = 0

        for i in range(1, 2 * n + 1):
            if i % 2 == 0:
                ans += i
            else:
                res += i

        return gcd(ans, res)