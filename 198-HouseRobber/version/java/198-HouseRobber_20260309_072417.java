// Last updated: 09/03/2026, 07:24:17
1class Solution {
2    public int rob(int[] nums) {
3        int sum1=0;
4        int sum2=0;
5        for(int i=0;i<nums.length;i++){
6            int newrob=sum2+nums[i];
7            int newnorob=Math.max(sum1,sum2);
8            sum1=newrob;
9            sum2=newnorob;
10        }
11        return (sum1>sum2)?sum1:sum2;
12    }
13}