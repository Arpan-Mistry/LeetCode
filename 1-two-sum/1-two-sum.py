class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d={}
        for i,n in enumerate(nums):
            remaining=target-n
            if remaining in d:
                return[d[remaining],i]
            d[n]=i