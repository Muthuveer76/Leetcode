class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        n = len(nums)
        ans = 0
        for i in range(1 << n):
            res = 0
            for j in range(n):
                if i >> j & 1:
                    res ^= nums[j]
            ans += res
        return ans