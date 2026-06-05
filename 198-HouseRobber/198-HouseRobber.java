// Last updated: 6/5/2026, 11:13:06 AM
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3        int max=0;
4        for(int i=0;i<nums.length;i++){
5            max=Math.max(max,nums[i]);
6        }
7        int dp[]=new int[max+1];
8        for(int i=0;i<nums.length;i++){
9            dp[nums[i]]+=nums[i];
10        }
11        int a=0;
12        int b=0;
13        int m=0;
14        for(int i=0;i<dp.length;i++){
15            m=Math.max(a,b+dp[i]);
16            b=a;
17            a=m;
18        }
19        return (a>b)?a:b;
20    }
21}