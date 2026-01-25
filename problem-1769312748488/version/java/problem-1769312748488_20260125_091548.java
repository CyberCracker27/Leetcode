// Last updated: 25/01/2026, 09:15:48
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int n=nums.length;
4        int i=n-1;
5        while(i>0 && nums[i-1]<nums[i]){
6            i--;
7        }
8        return i;
9    }
10}