// Last updated: 9/2/2026, 7:00:57 AM
1class Solution {
2    public int triangularSum(int[] nums) {
3        for(int n=nums.length;n>1;n--){
4            for(int i=0;i<n-1;i++){
5                nums[i]=(nums[i]+nums[i+1])%10;
6            }
7        }
8        return nums[0];
9    }
10}