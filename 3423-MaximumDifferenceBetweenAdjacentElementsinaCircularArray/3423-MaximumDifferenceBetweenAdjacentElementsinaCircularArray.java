// Last updated: 10/20/2026, 8:59:27 PM
1class Solution {
2    public int maxAdjacentDistance(int[] nums) {
3        int n=nums.length-1;
4        int max=Math.abs(nums[0]-nums[n]);
5        for(int i=0;i<n;i++){
6            int c=Math.abs(nums[i]-nums[i+1]);
7            if(c>max){
8                max=c;
9            }
10        }
11        return max;
12    }
13}