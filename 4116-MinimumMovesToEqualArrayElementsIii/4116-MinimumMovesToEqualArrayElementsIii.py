# Last updated: 31/01/2026, 07:57:35
class Solution(object):
    def minMoves(self, nums):
        nums.sort()
        sum1=0
        for i in range(0,len(nums)):
            a=nums[len(nums)-1]-nums[i]
            sum1+=a
        return sum1