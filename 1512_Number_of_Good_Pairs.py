class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        ans = 0
        mp = {}

        for i in range(len(nums)):
            if nums[i] in mp:
                ans += mp[nums[i]]
            mp[nums[i]] = mp.get(nums[i], 0) + 1

        return ans