# Last updated: 24/01/2026, 21:24:13
1class Solution(object):
2    def maximizeExpressionOfThree(self, nums):
3        nums.sort()
4        return nums[len(nums)-1]+nums[len(nums)-2]-nums[0]