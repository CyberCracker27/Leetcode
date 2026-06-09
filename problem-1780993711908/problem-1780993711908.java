// Last updated: 6/9/2026, 1:58:31 PM
1class Solution {
2    public long subArrayRanges(int[] nums) {
3        long c=0;
4        for(int i=0;i<nums.length;i++){
5            int max=nums[i];
6            int min=nums[i];
7            for(int j=i+1;j<nums.length;j++){
8                max=Math.max(max,nums[j]);
9                min=Math.min(min,nums[j]);
10                c+=max-min;
11            }
12        }
13        return c;
14    }
15}