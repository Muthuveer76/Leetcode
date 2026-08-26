class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        for i in range(k):
            n=min(nums)
            j=nums.index(n)
            nums[j]*=multiplier
        return nums