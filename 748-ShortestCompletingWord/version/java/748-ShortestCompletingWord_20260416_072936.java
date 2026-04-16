// Last updated: 16/04/2026, 07:29:36
1class Solution {
2    public int returnToBoundaryCount(int[] nums) {
3        int c=0,sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum+=nums[i];
6            if(sum==0){
7                c++;
8            }
9        }
10        return c;
11    }
12}