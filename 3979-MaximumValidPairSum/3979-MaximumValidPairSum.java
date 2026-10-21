// Last updated: 10/21/2026, 6:44:16 AM
1class Solution {
2    public int maxValidPairSum(int[] nums, int k) {
3        int max=nums[0];
4        int res=0;
5        for(int i=k;i<nums.length;i++){
6            max=Math.max(max,nums[i-k]);
7            res=Math.max(res,max+nums[i]);
8        }
9        return res;
10    }
11}