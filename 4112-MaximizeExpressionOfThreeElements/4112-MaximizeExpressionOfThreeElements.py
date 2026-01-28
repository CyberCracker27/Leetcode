# Last updated: 28/01/2026, 08:09:44
class Solution(object):
    def maximizeExpressionOfThree(self, nums):
        nums.sort()
        return nums[-1]+nums[-2]-nums[0]