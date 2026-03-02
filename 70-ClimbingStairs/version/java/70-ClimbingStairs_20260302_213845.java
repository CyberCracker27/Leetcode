// Last updated: 02/03/2026, 21:38:45
1class Solution {
2    public int climbStairs(int n) {
3        if (n<=3) return n;
4        int prev1=3;
5        int prev2=2;
6        int curr =0;
7        for(int i=4;i<=n;i++){
8            curr =prev1+prev2;
9            prev2=prev1;
10            prev1=curr;
11        }
12        return curr;
13    }
14}