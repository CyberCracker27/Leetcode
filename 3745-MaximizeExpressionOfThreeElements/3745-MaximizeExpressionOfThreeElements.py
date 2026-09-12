# Last updated: 9/12/2026, 7:18:33 AM
class Solution(object):
    def maximizeExpressionOfThree(self, nums):
        nums.sort()
        return nums[-1]+nums[-2]-nums[0]