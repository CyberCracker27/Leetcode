// Last updated: 9/12/2026, 7:18:39 AM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1]+nums[nums.length-2]-nums[0];
    }
}