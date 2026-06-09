// Last updated: 6/9/2026, 12:15:47 PM
1class Solution {
2    public long maxTotalValue(int[] nums, int k) {
3        int max=nums[0],min=nums[0];
4        for(int i:nums){
5            max=Math.max(max,i);
6            min=Math.min(min,i);
7        }
8        return (long)(max-min)*k;
9    }
10}