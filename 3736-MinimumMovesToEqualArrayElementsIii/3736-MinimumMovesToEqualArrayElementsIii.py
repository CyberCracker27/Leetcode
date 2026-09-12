# Last updated: 9/12/2026, 7:18:29 AM
class Solution(object):
    def minMoves(self, nums):
        nums.sort()
        sum1=0
        for i in range(0,len(nums)):
            a=nums[len(nums)-1]-nums[i]
            sum1+=a
        return sum1