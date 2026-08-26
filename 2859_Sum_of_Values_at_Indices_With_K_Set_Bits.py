class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        ans=0
        for i in range(len(nums)):
            n=i
            res=0
            while n:
                res+=n&1
                n>>=1
            if res==k:
                ans+=nums[i]
        return ans