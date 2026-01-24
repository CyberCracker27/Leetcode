# Last updated: 24/01/2026, 21:25:01
class Solution(object):
    def maximizeExpressionOfThree(self, nums):
        nums.sort()
        return nums[-1] + nums[-2] - nums[0]
