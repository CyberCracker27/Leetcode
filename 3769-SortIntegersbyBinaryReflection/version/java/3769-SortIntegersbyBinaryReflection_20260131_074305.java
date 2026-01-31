// Last updated: 31/01/2026, 07:43:05
1class Solution {
2    public int minMoves(int[] nums) {
3        Arrays.sort(nums);
4        int sum=0;
5        for(int i=0;i<nums.length;i++){
6            int a=nums[nums.length-1]-nums[i];
7            sum=sum+a;
8        }
9        return sum;
10    }
11}