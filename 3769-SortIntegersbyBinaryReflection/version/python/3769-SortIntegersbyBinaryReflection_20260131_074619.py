# Last updated: 31/01/2026, 07:46:19
1class Solution(object):
2    def minMoves(self, nums):
3        nums.sort()
4        sum1=0
5        for i in range(0,len(nums)):
6            a=nums[len(nums)-1]-nums[i]
7            sum1+=a
8        return sum1