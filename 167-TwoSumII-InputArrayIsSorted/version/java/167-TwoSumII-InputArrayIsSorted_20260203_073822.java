// Last updated: 03/02/2026, 07:38:22
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        for(int i=0;i<nums.length;i++){
4            for(int j=i+1;j<nums.length;j++){
5                if(nums[i]+nums[j]==target){
6                    return new int[]{i+1,j+1};
7                }
8            }
9        }
10        return new int[]{0,0};
11    }
12}