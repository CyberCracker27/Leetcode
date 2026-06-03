// Last updated: 6/3/2026, 2:10:50 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int left=0,right=nums.length-1;
4        while(left<right){
5            int m=(left+right)/2;
6            if(nums[right]<nums[m]) left=m+1;
7            else right=m;
8        }
9        return nums[right];
10    }
11}