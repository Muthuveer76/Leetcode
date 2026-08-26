class Solution:
    def minElement(self, nums: List[int]) -> int:
        ans = 10**9

        for i in range(len(nums)):
            n = nums[i]
            res = 0

            while n:
                res += n % 10
                n //= 10

            ans = min(ans, res)

        return ans