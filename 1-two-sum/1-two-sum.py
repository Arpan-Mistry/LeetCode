# class Solution:
#     def twoSum(self, nums: List[int], target: int) -> List[int]:
#         out=[]
#         for i in range(0,len(nums)):
#             for j in range(i+1,len(nums)):
#                 if(nums[i]+nums[j]==target):
#                     out.append(i)
#                     out.append(j)
#                     return out
                
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d={}
        for i,n in enumerate(nums):
            remaining=target-n
            if remaining in d:
                return[d[remaining],i]
            d[n]=i