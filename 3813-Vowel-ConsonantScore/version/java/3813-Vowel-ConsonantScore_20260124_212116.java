// Last updated: 24/01/2026, 21:21:16
1class Solution {
2    public int maximizeExpressionOfThree(int[] nums) {
3        Arrays.sort(nums);
4        return nums[nums.length-1]+nums[nums.length-2]-nums[0];
5    }
6}