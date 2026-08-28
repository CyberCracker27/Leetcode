// Last updated: 8/28/2026, 6:55:15 AM
1class Solution {
2    public int getMinDistance(int[] nums, int target, int start) {
3        int c=Integer.MAX_VALUE;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]==target){
6                int d=Math.abs(i-start);
7                if(d<c){
8                    c=d;
9                }
10            }
11        }
12        return c;
13    }
14}